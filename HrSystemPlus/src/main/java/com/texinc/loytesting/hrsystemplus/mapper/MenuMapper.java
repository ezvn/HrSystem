package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.Menu;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/12 7:05 PM
 */
public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> getMenusByHrId(Integer hrid);

    List<Menu> getAllMenusWithRole();

    List<Menu> getAllMenus();

    List<Integer> getMidsByRid(Integer rid);
}
