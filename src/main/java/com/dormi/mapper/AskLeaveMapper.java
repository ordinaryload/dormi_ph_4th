package com.dormi.mapper;

import com.dormi.domain.AskLeave;
import com.dormi.domain.AskLeaveExample;
import java.util.List;

import com.dormi.domain.Student;
import org.apache.ibatis.annotations.Param;

public interface AskLeaveMapper {
    void addAskLeave(AskLeave askLeave);

    List<AskLeave> leaveRecord(Student student);

    long countByExample(AskLeaveExample example);

    int deleteByExample(AskLeaveExample example);

    int deleteByPrimaryKey(Integer leaveId);

    int insert(AskLeave record);

    int insertSelective(AskLeave record);

    List<AskLeave> selectByExample(AskLeaveExample example);

    AskLeave selectByPrimaryKey(Integer leaveId);

    int updateByExampleSelective(@Param("record") AskLeave record, @Param("example") AskLeaveExample example);

    int updateByExample(@Param("record") AskLeave record, @Param("example") AskLeaveExample example);

    int updateByPrimaryKeySelective(AskLeave record);

    int updateByPrimaryKey(AskLeave record);
}