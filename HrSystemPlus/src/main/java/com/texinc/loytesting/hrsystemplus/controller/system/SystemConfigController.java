package com.texinc.loytesting.hrsystemplus.controller.system;

import com.texinc.loytesting.hrsystemplus.bean.Menu;
import com.texinc.loytesting.hrsystemplus.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/18 9:08 PM
 */
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {
    @Autowired
    MenuService menuService;
    @GetMapping("/menu")
    public List<Menu> getMenusByHrId() {
        return menuService.getMenusByHrId();
    }
}
