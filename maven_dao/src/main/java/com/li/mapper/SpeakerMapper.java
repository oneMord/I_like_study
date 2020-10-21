package com.li.mapper;

import com.li.pojo.Speaker;

public interface SpeakerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Speaker record);

    int insertSelective(Speaker record);

    Speaker selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Speaker record);

    int updateByPrimaryKeyWithBLOBs(Speaker record);

    int updateByPrimaryKey(Speaker record);
}