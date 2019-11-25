package com.dormi.controller;


import com.dormi.constant.DormiConstants;
import com.dormi.domain.Registration;
import com.dormi.service.WebRegistrationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/webRegistration")
public class WebRegistrationController {

    @Autowired
    private WebRegistrationService webRegistrationService;

    @Autowired
    private ObjectMapper objectMapper;

    /**
     * 查询所有出寝登记信息
     * @return
     * @throws JsonProcessingException
     */
    @RequestMapping(value = "/findAllRegistration",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String findAllRegistration() throws JsonProcessingException {
        List<Registration> allRegistration = webRegistrationService.findAllRegistration();
        Map<String,Object> returnMap = new HashMap<String,Object>();
        if(allRegistration != null){
            returnMap.put("state", DormiConstants.SUCCESS);
            returnMap.put("allRegistration",allRegistration);
        }else {
            returnMap.put("state", DormiConstants.fail);
        }

        return objectMapper.writeValueAsString(returnMap);

    }


}
