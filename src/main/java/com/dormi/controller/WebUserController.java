package com.dormi.controller;

import com.dormi.constant.DormiConstants;
import com.dormi.domain.Administrators;
import com.dormi.service.WebUserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/webUser")
public class WebUserController {
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private WebUserService webUserService;


    private static String loginUUID;

    private static int loginId;

    @RequestMapping("/webToLogin")
    public String webToLogin(){
        return "/login";
    }


    /**
     * 用户登录接口
     * @param administrators
     * @param session
     * @return
     */
    @RequestMapping(value = "/webLogin",method = RequestMethod.POST)
    @ResponseBody
    public String webLogin(@RequestBody Administrators administrators, HttpSession session) throws JsonProcessingException {
        Administrators loginAdministrators = webUserService.login(administrators);
        loginUUID = UUID.randomUUID().toString().replace("-","");

        loginId = loginAdministrators.getAdminId();

        Map<String,Object> returnMap = new HashMap<String,Object>();
        if(loginAdministrators != null){
            session.setAttribute("loginAdministrators",loginAdministrators);
            returnMap.put("webUserId",loginAdministrators.getAdminId());
            returnMap.put("state", DormiConstants.SUCCESS);
        }else {
            returnMap.put("state", DormiConstants.fail);
        }

        return objectMapper.writeValueAsString(returnMap);
    }

    @RequestMapping("/webToRegister")
    public String webToRegister(){

        return "register";
    }

    /**
     * 用户注册接口
     * @param administrators
     * @return
     */
    @RequestMapping(value = "/webRegister",method = RequestMethod.PUT)
    @ResponseBody
    public String webRegister(@RequestBody Administrators administrators) throws JsonProcessingException {
        Map<String,Object> returnMap = new HashMap<String,Object>();
        if(webUserService.regist(administrators)){
            returnMap.put("state", DormiConstants.SUCCESS);
        }else {
            returnMap.put("state", DormiConstants.fail);
        }
        return objectMapper.writeValueAsString(returnMap);

    }

    /**
     * 用户个人信息
     * @param session
     * @return
     */
    @RequestMapping(value = "/getInfo",method = RequestMethod.GET)
//    @ResponseBody
    public String getPersonalInfo(HttpSession session) throws JsonProcessingException {
        Administrators administrators = (Administrators) session.getAttribute("loginAdministrators");
        Map<String,Object> returnMap = new HashMap<String,Object>();

        System.out.println(administrators.getAdminCard());
        System.out.println(administrators.getAdminPassword());
        System.out.println(administrators.getAdminBuilding());
        System.out.println(administrators.getAdminName());

        session.setAttribute("administrators",administrators);
        returnMap.put("state", DormiConstants.SUCCESS);
        returnMap.put("data",administrators);
        return "userinfo";

    }


    @RequestMapping("/getUserInfo")
    @ResponseBody
    public String getUserInfo(String webuserId) throws JsonProcessingException {

        int i = Integer.parseInt(webuserId);
        System.out.println(i);
        Administrators userServiceOne = webUserService.findOne(i);

        Map<String,Object> returnMap = new HashMap<String,Object>();

        returnMap.put("administrators",userServiceOne);
        return objectMapper.writeValueAsString(userServiceOne);
    }
}
