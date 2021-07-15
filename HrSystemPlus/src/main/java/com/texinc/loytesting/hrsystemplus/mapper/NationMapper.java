package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.Nation;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/17 1:18 PM
 */
public interface NationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Nation record);

    int insertSelective(Nation record);

    Nation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Nation record);

    int updateByPrimaryKey(Nation record);

    List<Nation> getAllNations();
}
