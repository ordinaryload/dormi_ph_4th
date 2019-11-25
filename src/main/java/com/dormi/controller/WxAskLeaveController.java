package com.dormi.controller;


import com.dormi.constant.DormiConstants;
import com.dormi.domain.AskLeave;
import com.dormi.domain.Notice;
import com.dormi.domain.Registration;
import com.dormi.service.WxAskLeaveService;
import com.dormi.service.WxGoodsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/wx")
public class WxAskLeaveController {
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private WxAskLeaveService wxAskLeaveService;



    @RequestMapping(value = "/askleave",method = RequestMethod.POST)
    @ResponseBody
    public String addAskLeave(HttpServletRequest request,MultipartFile askFile,
                              @RequestParam("studentName" ) String studentName,
                              @RequestParam("studentMajor") String studentMajor,
                              @RequestParam("studentCard") String studentCard,
                              @RequestParam("leaveReason") String leaveReason,
                              @RequestParam("leaveDate") String leaveDate,
                              @RequestParam("dormNumber") String dormNumber
                              )throws IOException{
        //Registration registration = JSON.parseObject(jsonStr,Registration.class);//将json字符串转换成json对象

        AskLeave askLeave=new AskLeave();
        String lastName=UUID.randomUUID().toString().replace("-","");

        String fileName="";
        String filePath="";
        if(askFile!=null)
        {
            fileName=askFile.getOriginalFilename();
            fileName=lastName+"_"+fileName;
            filePath=request.getSession().getServletContext().getRealPath("/images/");
            File file=new File(filePath);
            if(!file.exists())
            {
                file.mkdir();
            }
            askFile.transferTo(new File(filePath,fileName));

            askLeave.setLeaveFile("/images/"+fileName);
        }
         SimpleDateFormat fmt =new SimpleDateFormat("yyyy-MM-dd");
        Date tmpDate=new Date();
        try{
            tmpDate=fmt.parse(leaveDate);
        }catch(ParseException e)
        {
            e.printStackTrace();
        }

        askLeave.setStudentCard(studentCard);
        askLeave.setLeaveDate(tmpDate);
        askLeave.setLeaveReason(leaveReason);
        askLeave.setStudentName(studentName);
        askLeave.setStudentMajor(studentMajor);
        askLeave.setDormNumber(dormNumber);


        this.wxAskLeaveService.addAskLeave(askLeave);
        return "success";
    }




}
