package com.dormi.mapper;

import com.dormi.domain.Registration;
import com.dormi.domain.RegistrationExample;
import java.util.List;

import com.dormi.domain.Student;
import org.apache.ibatis.annotations.Param;

public interface RegistrationMapper {

    void addGoods(Registration registration);

    List<Registration> goodsRecord(Student student);

    long countByExample(RegistrationExample example);

    int deleteByExample(RegistrationExample example);

    int deleteByPrimaryKey(Integer registrationId);

    int insert(Registration record);

    int insertSelective(Registration record);

    List<Registration> selectByExample(RegistrationExample example);

    Registration selectByPrimaryKey(Integer registrationId);

    int updateByExampleSelective(@Param("record") Registration record, @Param("example") RegistrationExample example);

    int updateByExample(@Param("record") Registration record, @Param("example") RegistrationExample example);

    int updateByPrimaryKeySelective(Registration record);

    int updateByPrimaryKey(Registration record);
}