package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.Position;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/12 7:05 PM
 */
public interface PositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);

    List<Position> getAllPositions();

    Integer deletePositionsByIds(@Param("ids") Integer[] ids);
}
