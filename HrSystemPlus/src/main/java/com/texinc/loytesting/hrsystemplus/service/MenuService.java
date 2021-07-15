package com.texinc.loytesting.hrsystemplus.service;

import com.texinc.loytesting.hrsystemplus.bean.Hr;
import com.texinc.loytesting.hrsystemplus.bean.Menu;
import com.texinc.loytesting.hrsystemplus.mapper.MenuMapper;
import com.texinc.loytesting.hrsystemplus.mapper.MenuRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/12 7:35 PM
 */
@Service
@CacheConfig(cacheNames = "menus_cache")
public class MenuService {
    @Autowired
    MenuMapper menuMapper;
    @Autowired
    MenuRoleMapper menuRoleMapper;
    public List<Menu> getMenusByHrId() {
        return menuMapper.getMenusByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    @Cacheable
    public List<Menu> getAllMenusWithRole() {
        return menuMapper.getAllMenusWithRole();
    }

    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }

    public List<Integer> getMidsByRid(Integer rid) {
        return menuMapper.getMidsByRid(rid);
    }

    @Transactional
    public boolean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.deleteByRid(rid);
        if (mids == null || mids.length == 0) {
            return true;
        }
        Integer result = menuRoleMapper.insertRecord(rid, mids);
        return result==mids.length;
    }
}
