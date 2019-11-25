package com.dormi.controller;

import com.dormi.domain.Notice;
import com.dormi.service.WebNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
public class WebHomeController {


    @Autowired
    private WebNoticeService webNoticeService;

    @RequestMapping("/toHome")
    public String toHome() {
        return "/home";
    }


    @RequestMapping("/toUpdateScore")
    public String toUpdateScore(HttpServletRequest request,@RequestParam("dormNumber") String dormNumber){
        request.getSession().setAttribute("dormNumber",dormNumber);
        return "updateleave";

    }

    @RequestMapping("/toUpdateNotice")
    public String toUpdateNotice(HttpServletRequest request,@RequestParam("noticeId") String noticeId){

        Integer noId = Integer.parseInt(noticeId);
        Notice oneNotice = webNoticeService.findOneNotice(noId);

        if(oneNotice != null){
            request.getSession().setAttribute("oneNotice",oneNotice);
        }

        return "editnotice";
    }

    @RequestMapping("/toNotice")
    public String toNotice() {
        return "/notice";
    }

}
