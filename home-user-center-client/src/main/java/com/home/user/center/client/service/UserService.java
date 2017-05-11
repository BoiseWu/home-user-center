package com.home.user.center.client.service;

import com.home.user.center.client.vo.UserParam;
import com.home.user.center.client.vo.UserResult;

import java.util.List;

/**
 * Created by wuzebo1 on 2016/4/21.
 */
public interface UserService {
    UserResult getUserInfo(UserParam userParam);
    UserResult getUserInfoDetial(UserParam userParam);
    List<UserResult> getUserInfoList(UserParam userParam);
    Integer regUserInfo(UserParam userParam);
    Integer updateUserInfo(UserParam userParam);

    //创建连接
    void createConnection();
}
