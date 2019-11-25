package com.dormi.service;

import com.dormi.domain.Student;


public interface WxUserLoginService {

    Student loginCheck(Student student);


    int findUser(String studentCard);
}
