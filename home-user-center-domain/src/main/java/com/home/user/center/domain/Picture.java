package com.home.user.center.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wuzebo1 on 2016/5/29.
 */
public class Picture implements Serializable {
    private Long id;
    private Long userId;
    private String picUrl;
    private Integer picStatus;
    private Integer picType;
    private Integer sortNumber;
    private Date createTime;
    private Date updateTime;

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

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getPicStatus() {
        return picStatus;
    }

    public void setPicStatus(Integer picStatus) {
        this.picStatus = picStatus;
    }

    public Integer getPicType() {
        return picType;
    }

    public void setPicType(Integer picType) {
        this.picType = picType;
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
