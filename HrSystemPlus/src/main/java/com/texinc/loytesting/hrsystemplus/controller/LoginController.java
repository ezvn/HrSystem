package com.texinc.loytesting.hrsystemplus.controller;

import com.texinc.loytesting.hrsystemplus.bean.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author i@loyio.me
 * @date 2020/11/16 9:03 PM
 */
@RestController
public class LoginController {
    @GetMapping("/login")
    public RespBean login() {
        return RespBean.error("尚未登录，请登录!");
    }
}
