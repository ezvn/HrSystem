package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.PoliticsStatus;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/17 1:25 PM
 */
public interface PoliticsStatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PoliticsStatus record);

    int insertSelective(PoliticsStatus record);

    PoliticsStatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PoliticsStatus record);

    int updateByPrimaryKey(PoliticsStatus record);

    List<PoliticsStatus> getAllPoliticsstatus();
}
