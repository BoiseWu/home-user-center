package com.home.user.center.client.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wuzebo1 on 2016/4/21.
 */
public class UserResult implements Serializable{

    private Long id;
    private String userName;
    private String userPass;
    private Integer userType;
    private String userPic;
    private Integer userStatus;
    private String userPhone;
    private String userEmail;
    private Date updateTime;
    private Date createTime;

    private UserGroupResult userGroupResult;

    public UserGroupResult getUserGroupResult() {
        return userGroupResult;
    }

    public void setUserGroupResult(UserGroupResult userGroupResult) {
        this.userGroupResult = userGroupResult;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
