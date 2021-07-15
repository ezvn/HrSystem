package com.texinc.loytesting.hrsystemplus.service;

import com.texinc.loytesting.hrsystemplus.bean.JobLevel;
import com.texinc.loytesting.hrsystemplus.mapper.JobLevelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/12 7:33 PM
 */
@Service
public class JobLevelService {
    @Autowired
    JobLevelMapper jobLevelMapper;

    public List<JobLevel> getAllJobLevels() {
        return jobLevelMapper.getAllJobLevels();
    }

    public Integer addJobLevel(JobLevel jobLevel) {
        jobLevel.setCreateDate(new Date());
        jobLevel.setEnabled(true);
        return jobLevelMapper.insertSelective(jobLevel);
    }

    public Integer updateJobLevelById(JobLevel jobLevel) {
        return jobLevelMapper.updateByPrimaryKeySelective(jobLevel);
    }

    public Integer deleteJobLevelById(Integer id) {
        return jobLevelMapper.deleteByPrimaryKey(id);
    }

    public Integer deleteJobLevelsByIds(Integer[] ids) {
        return jobLevelMapper.deleteJobLevelsByIds(ids);
    }
}
