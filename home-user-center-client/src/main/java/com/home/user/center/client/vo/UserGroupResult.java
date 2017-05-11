package com.home.user.center.client.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by wuzebo1 on 2016/4/27.
 */
public class UserGroupResult implements Serializable {
    private Long id;
    private String groupName;
    private Long createUserId;
    private Integer groupType;
    private Integer flag;
    private Date createTime;
    private List<UserResult> userResultList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Integer getGroupType() {
        return groupType;
    }

    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<UserResult> getUserResultList() {
        return userResultList;
    }

    public void setUserResultList(List<UserResult> userResultList) {
        this.userResultList = userResultList;
    }
}
