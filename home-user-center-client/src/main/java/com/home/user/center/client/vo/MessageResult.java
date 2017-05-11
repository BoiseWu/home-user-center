package com.home.user.center.client.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wuzebo1 on 2016/6/9.
 */
public class MessageResult implements Serializable{
    private Long id;
    private Long userId;
    private String userPic;
    private Long toUserId;
    private String toUserPic;
    private String message;
    private Integer type;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }

    public Long getToUserId() {
        return toUserId;
    }

    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
    }

    public String getToUserPic() {
        return toUserPic;
    }

    public void setToUserPic(String toUserPic) {
        this.toUserPic = toUserPic;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
