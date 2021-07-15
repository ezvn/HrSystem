package com.texinc.loytesting.hrsystemplus.common;

import com.texinc.loytesting.hrsystemplus.bean.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author i@loyio.me
 * @date 2020/11/12 3:57 PM
 */
public class HrUtils {
    public static Hr getCurrentHr() {
        return (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
