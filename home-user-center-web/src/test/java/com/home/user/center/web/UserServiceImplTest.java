package com.home.user.center.web;

import com.home.user.center.client.service.UserService;
import com.home.user.center.client.vo.UserParam;
import com.home.user.center.client.vo.UserResult;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by wuzebo1 on 2016/4/21.
 */

public class UserServiceImplTest extends BaseTest {

    @Resource
    private UserService userService;

    @Test
    public void testRegUser(){
        UserParam userParam = new UserParam();
        userParam.setUserName("admin");
        userParam.setUserType(1);
        userParam.setUserStatus(1);
        userParam.setUserPhone("13011113333");
        userService.regUserInfo(userParam);
    }

    @Test
    public void testUpdateUser(){
        UserParam userParam = new UserParam();
        userParam.setId(12l);
        userParam.setUserName("admin1");
        userParam.setUserType(1);
        userParam.setUserStatus(1);
        userParam.setUserPhone("13011110000");
        userService.updateUserInfo(userParam);
    }

    @Test
    public void testSelect(){
        UserParam userParam = new UserParam();
        userParam.setId(12l);
        UserResult userResult = userService.getUserInfo(userParam);
        System.out.print(userResult);
    }

    @Test
    public void testSelectList(){
        UserParam userParam = new UserParam();
        userParam.setUserType(1);
        List<UserResult> userResultList = userService.getUserInfoList(userParam);
        System.out.print(userResultList);
    }

    @Test
    public void tetsSelectDetial(){
        UserParam userParam = new UserParam();
        userParam.setUserName("admin");
        UserResult userResult = userService.getUserInfoDetial(userParam);
        System.out.print(userResult);
    }
}
