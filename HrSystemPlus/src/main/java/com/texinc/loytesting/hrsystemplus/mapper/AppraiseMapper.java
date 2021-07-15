package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.Appraise;

/**
 * @author i@loyio.me
 * @date 2020/11/17 5:59 PM
 */
public interface AppraiseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Appraise record);

    int insertSelective(Appraise record);

    Appraise selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Appraise record);

    int updateByPrimaryKey(Appraise record);
}
