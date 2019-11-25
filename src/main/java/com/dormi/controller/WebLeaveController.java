package com.dormi.controller;

import com.dormi.constant.DormiConstants;
import com.dormi.domain.AskLeave;
import com.dormi.service.WebLeaveService;
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
@RequestMapping("/webLeave")
public class WebLeaveController {


    @Autowired
    private WebLeaveService webLeaveService;

    @Autowired
    private ObjectMapper objectMapper;

    /**
     * 查询所有请假信息
     * @return
     * @throws JsonProcessingException
     */
    @RequestMapping(value = "/findAllLeaveMessage",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String findAllLeaveMessage() throws JsonProcessingException {

        List<AskLeave> allLeaveMessage = webLeaveService.findAllLeaveMessage();
        Map<String,Object> returnMap = new HashMap<String,Object>();
        if(allLeaveMessage != null){
            returnMap.put("state", DormiConstants.SUCCESS);
            returnMap.put("allLeaveMessage",allLeaveMessage);
        }else {
            returnMap.put("state", DormiConstants.fail);
        }

        return objectMapper.writeValueAsString(returnMap);


    }

}
