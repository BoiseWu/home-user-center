package com.home.user.center.service.impl;

import com.home.user.center.client.service.UserGroupService;
import com.home.user.center.client.vo.UserGroupParam;
import com.home.user.center.client.vo.UserGroupResult;
import com.home.user.center.dao.UserGroupDao;
import com.home.user.center.domain.UserGroup;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wuzebo1 on 2016/4/28.
 */
@Service("userGroupService")
public class UserGroupServiceImpl implements UserGroupService{

    @Resource
    private UserGroupDao userGroupDao;
    @Override
    public Integer createUserGroup(UserGroupParam userGroupParam){
        UserGroup userGroup = new UserGroup();
        BeanUtils.copyProperties(userGroupParam, userGroup);
        return userGroupDao.insert(userGroup);
    }

    @Override
    public UserGroupResult getUserGroupById(Long id){
        UserGroupResult userGroupResult = new UserGroupResult();
        UserGroup userGroup = userGroupDao.selectById(id);
        BeanUtils.copyProperties(userGroup, userGroupResult);
        return userGroupResult;
    }

    @Override
    public Integer updateUserGroup(UserGroupParam userGroupParam){
        UserGroup userGroup = new UserGroup();
        BeanUtils.copyProperties(userGroupParam, userGroup);
        return userGroupDao.updateById(userGroup);
    }
}
