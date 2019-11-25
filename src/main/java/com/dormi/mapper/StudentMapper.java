package com.dormi.mapper;

import com.dormi.domain.Notice;
import com.dormi.domain.Registration;
import com.dormi.domain.Student;
import com.dormi.domain.StudentExample;
import com.dormi.mapper.StudentMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    void regist(Student student);

    Student loginCheck(Student student);

    int findUser(String studeentCard);

    List<Student> selectStuInfo(String studentCard);

    void addGoods(Registration registration);

    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer studentId);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer studentId);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}