package com.dormi.controller;

import com.dormi.domain.Student;
import com.dormi.service.WxRegisterService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/wx")
public class WxRegisterController {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private WxRegisterService wxRegisterService;

    @RequestMapping("/register")
    @ResponseBody
    public String regist(@RequestBody Student student){
        wxRegisterService.regist(student);
        return "success";
    }

//    @ResponseBody
//    @RequestMapping("/login")
//    public String login(@RequestBody Map o){
//        String card = (String)o.get("student_card");
//        String password = (String)o.get("student_password");
//        Student student = new Student();
//        student.setStudentCard(card);
//        student.setStudentPassword(password);
//        Student studentdemo = wxRegisterService.login(student);
//        if(studentdemo == null){
//            System.out.println("不存在");
//            return "/loginFail";
//        }else {
//            return "/loginSuccess";
//        }
//
//    }

}
