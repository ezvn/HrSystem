package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.OpLog;

/**
 * @author i@loyio.me
 * @date 2020/11/18 8:07 AM
 */
public interface OpLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OpLog record);

    int insertSelective(OpLog record);

    OpLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpLog record);

    int updateByPrimaryKey(OpLog record);
}
