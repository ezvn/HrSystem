package com.texinc.loytesting.hrsystemplus.service;

import com.texinc.loytesting.hrsystemplus.bean.PoliticsStatus;
import com.texinc.loytesting.hrsystemplus.mapper.PoliticsStatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/17 1:25 PM
 */
@Service
public class PoliticsStatusService {
    @Autowired
    PoliticsStatusMapper politicsstatusMapper;
    public List<PoliticsStatus> getAllPoliticsstatus() {
        return politicsstatusMapper.getAllPoliticsstatus();
    }
}
