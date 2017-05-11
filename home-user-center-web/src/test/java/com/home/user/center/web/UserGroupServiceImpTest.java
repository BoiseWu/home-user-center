package com.home.user.center.web;

import com.home.user.center.client.service.UserGroupService;
import com.home.user.center.client.vo.UserGroupParam;
import com.home.user.center.client.vo.UserGroupResult;
import com.home.user.center.domain.UserGroup;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created by wuzebo1 on 2016/4/28.
 */
public class UserGroupServiceImpTest extends BaseTest {

    @Autowired
    private UserGroupService userGroupService;

    @Test
    public void testInsert(){
        UserGroupParam userGroupParam = new UserGroupParam();
        userGroupParam.setCreateUserId(6l);
        userGroupParam.setFlag(1);
        userGroupParam.setGroupName("aa1");
        userGroupParam.setGroupType(1);
        userGroupService.createUserGroup(userGroupParam);
    }

    @Test
    public void testUpdate(){
        UserGroupParam userGroupParam = new UserGroupParam();
        userGroupParam.setCreateUserId(7l);
        userGroupParam.setFlag(1);
        userGroupParam.setGroupName("aa2");
        userGroupParam.setGroupType(1);
        userGroupParam.setId(1l);
        userGroupService.updateUserGroup(userGroupParam);
    }

    @Test
    public void testGetUserGroup(){
        UserGroupResult userGroupResult = userGroupService.getUserGroupById(1l);
        System.out.print(userGroupResult);
    }
}
