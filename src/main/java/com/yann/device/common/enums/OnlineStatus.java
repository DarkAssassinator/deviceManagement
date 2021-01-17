package com.yann.device.common.enums;

/**
 * @author Yann
 * @title: OnlineStatus
 * @projectName device
 * @description: 在线用户状态
 * @date 2020/11/821:29
 */
public enum OnlineStatus {
    /**
     * 用户状态
     */
    on_line("在线"), off_line("离线");

    private final String info;

    private OnlineStatus(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
