package com.home.user.center.client.vo;

import java.io.Serializable;

/**
 * Created by wuzebo1 on 2016/6/9.
 */
public class MessageParam implements Serializable{
    private Long userId;
    private Long toUserId;
    private String message;
    private Integer type;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getToUserId() {
        return toUserId;
    }

    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
