package com.dormi.controller;

import com.dormi.constant.DormiConstants;
import com.dormi.domain.Notice;
import com.dormi.service.WebNoticeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("/webNotice")
public class WebNoticeController {

    @Autowired
    private WebNoticeService webNoticeService;

    @Autowired
    private ObjectMapper objectMapper;


    /**
     * 查询所有公告信息
     * @return
     * @throws JsonProcessingException
     */
    @RequestMapping(value = "/findAllNotice",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String findAllNotice() throws JsonProcessingException {
        List<Notice> allNotice = webNoticeService.findAllNotice();
        Map<String,Object> returnMap = new HashMap<>();
        if(allNotice != null) {
            returnMap.put("allNotice", allNotice);
            returnMap.put("state", DormiConstants.SUCCESS);
        }else {
            returnMap.put("state", DormiConstants.fail);
        }
        return objectMapper.writeValueAsString(returnMap);
    }



    @RequestMapping(value = "/insertNotice",method = RequestMethod.PUT)
    @ResponseBody
    public String insertNotice(MultipartFile ntFile, HttpServletRequest request) throws JsonProcessingException {
        Map<String,Object> returnMap = new HashMap<>();
        String originalFilename = ntFile.getOriginalFilename();
        String filePath = request.getSession().getServletContext().getRealPath("/images/");
        File file = new File(filePath);
        if(!file.exists()){
            file.mkdir();
        }
        String fileName = UUID.randomUUID().toString().replace("-", "");
        originalFilename = fileName + "_" + originalFilename;

        try {
            ntFile.transferTo(new File(filePath+originalFilename));
            returnMap.put("state", DormiConstants.SUCCESS);
        } catch (IOException e) {
            returnMap.put("state", DormiConstants.fail);
            e.printStackTrace();
        }

        return objectMapper.writeValueAsString(returnMap);
    }



    /**
     * 发布公告
     * @param ntFile
     * @param noticeTitle
     * @param noticeDesc
     * @return
     */
    @RequestMapping(value = "/publishNotice",method = RequestMethod.POST)
    public String publishNotice(HttpServletRequest request,
                                MultipartFile ntFile,
                                @RequestParam("noticeTitle") String noticeTitle,
                                @RequestParam("noticeDesc") String noticeDesc
    ) throws IOException {
        Notice notice = new Notice();
        String lastName = UUID.randomUUID().toString().replace("-", "");

        //结果存于map中返回给前台
        Map<String,Object> returnMap = new HashMap<>();
        //文件上传
        String fileName="";
        String filePath="";
        if(ntFile != null) {
            fileName = ntFile.getOriginalFilename();
            fileName = lastName + "_" + fileName;
            filePath = request.getSession().getServletContext().getRealPath("/images/");
            File file = new File(filePath);
            if (!file.exists()) {
                file.mkdir();
            }
            ntFile.transferTo(new File(filePath, fileName));
        }
        //在服务器中保存的位置
        String realPath = filePath+fileName;
        //将上传的信息进行保存
        //保存文件地址
        notice.setNoticeFile("/images/" + fileName);
        System.out.println(notice.getNoticeFile());
        //保存标题
        notice.setNoticeTitle(noticeTitle);
        //保存描述
        notice.setNoticeDesc(noticeDesc);
        notice.setNoticeDate(new Date());
        //上传数据库

        boolean flag=webNoticeService.publishNotice(notice);
        if(flag){
            returnMap.put("state", DormiConstants.SUCCESS);

        }else{
            returnMap.put("state", DormiConstants.fail);

        }
        return "/notice";
    }

    @RequestMapping(value = "/updateNotice",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8")
    @ResponseBody
    public String updateNotice(@RequestBody Notice notice) throws JsonProcessingException {
        boolean flag = webNoticeService.updataNotice(notice);
        Map<String,Object> returnMap = new HashMap<>();
        if(flag){
            returnMap.put("state", DormiConstants.SUCCESS);
        }else {
            returnMap.put("state", DormiConstants.fail);
        }
        return objectMapper.writeValueAsString(returnMap);
    }

}
