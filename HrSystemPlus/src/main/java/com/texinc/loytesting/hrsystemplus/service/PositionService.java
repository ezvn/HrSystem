package com.texinc.loytesting.hrsystemplus.service;

import com.texinc.loytesting.hrsystemplus.bean.Position;
import com.texinc.loytesting.hrsystemplus.mapper.PositionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/12 7:37 PM
 */
@Service
public class PositionService {
    @Autowired
    PositionMapper positionMapper;
    public List<Position> getAllPositions() {
        return positionMapper.getAllPositions();
    }

    public Integer addPosition(Position position) {
        position.setEnabled(true);
        position.setCreateDate(new Date());
        return positionMapper.insertSelective(position);
    }

    public Integer updatePositions(Position position) {
        return positionMapper.updateByPrimaryKeySelective(position);
    }

    public Integer deletePositionById(Integer id) {
        return positionMapper.deleteByPrimaryKey(id);
    }

    public Integer deletePositionsByIds(Integer[] ids) {
        return positionMapper.deletePositionsByIds(ids);
    }
}
