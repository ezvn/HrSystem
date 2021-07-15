package com.texinc.loytesting.hrsystemplus.bean;

import java.io.Serializable;

/**
 * @author i@loyio.me
 * @date 2020/11/12 7:13 PM
 */
public class MenuMeta implements Serializable {

    private boolean keepAlive;
    private boolean requireAuth;

    public boolean isKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

    public boolean isRequireAuth() {
        return requireAuth;
    }

    public void setRequireAuth(boolean requireAuth) {
        this.requireAuth = requireAuth;
    }
}
