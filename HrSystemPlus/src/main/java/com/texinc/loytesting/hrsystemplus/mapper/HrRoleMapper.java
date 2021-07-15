package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.HrRole;
import org.apache.ibatis.annotations.Param;

/**
 * @author i@loyio.me
 * @date 2020/11/18 8:10 AM
 */
public interface HrRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HrRole record);

    int insertSelective(HrRole record);

    HrRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HrRole record);

    int updateByPrimaryKey(HrRole record);

    void deleteByHrid(Integer hrid);

    Integer addRole(@Param("hrid") Integer hrid, @Param("rids") Integer[] rids);
}
