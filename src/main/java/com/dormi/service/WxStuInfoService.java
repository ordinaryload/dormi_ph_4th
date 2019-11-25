package com.dormi.service;

import com.dormi.domain.Notice;
import com.dormi.domain.Student;

import java.util.List;


public interface WxStuInfoService {
    List<Student> selectStuInfo(String studentCard);
}
