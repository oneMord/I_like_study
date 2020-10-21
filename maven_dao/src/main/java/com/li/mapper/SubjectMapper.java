package com.li.mapper;

import com.li.pojo.Subject;

public interface SubjectMapper {
    int insert(Subject record);

    int insertSelective(Subject record);
}