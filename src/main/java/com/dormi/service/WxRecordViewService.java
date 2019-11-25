package com.dormi.service;

import com.dormi.domain.AskLeave;
import com.dormi.domain.Notice;
import com.dormi.domain.Registration;
import com.dormi.domain.Student;

import java.util.List;

public interface WxRecordViewService {
    List<AskLeave> leaveRecord(Student student);
    List<Registration> goodsRecord(Student student);
}
