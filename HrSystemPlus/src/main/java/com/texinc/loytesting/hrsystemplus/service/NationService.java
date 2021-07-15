package com.texinc.loytesting.hrsystemplus.service;

import com.texinc.loytesting.hrsystemplus.bean.Nation;
import com.texinc.loytesting.hrsystemplus.mapper.NationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/17 1:17 PM
 */
@Service
public class NationService {
    @Autowired
    NationMapper nationMapper;
    public List<Nation> getAllNations() {
        return nationMapper.getAllNations();
    }
}
