package com.home.user.center.client.service;

import com.home.user.center.client.vo.UserGroupParam;
import com.home.user.center.client.vo.UserGroupResult;

/**
 * Created by wuzebo1 on 2016/4/28.
 */
public interface UserGroupService {

    Integer createUserGroup(UserGroupParam userGroupParam);

    UserGroupResult getUserGroupById(Long id);

    Integer updateUserGroup(UserGroupParam userGroupParam);
}