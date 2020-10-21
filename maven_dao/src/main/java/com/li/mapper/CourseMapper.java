package com.li.mapper;

import com.li.pojo.Course;

public interface CourseMapper {
    int insert(Course record);

    int insertSelective(Course record);
}