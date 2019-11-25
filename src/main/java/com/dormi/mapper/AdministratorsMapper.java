package com.dormi.mapper;

import com.dormi.domain.Administrators;
import com.dormi.domain.AdministratorsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdministratorsMapper {

    long countByExample(AdministratorsExample example);

    int deleteByExample(AdministratorsExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(Administrators record);

    int insertSelective(Administrators record);

    List<Administrators> selectByExample(AdministratorsExample example);

    Administrators selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") Administrators record, @Param("example") AdministratorsExample example);

    int updateByExample(@Param("record") Administrators record, @Param("example") AdministratorsExample example);

    int updateByPrimaryKeySelective(Administrators record);

    int updateByPrimaryKey(Administrators record);
}