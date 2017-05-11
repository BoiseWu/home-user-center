package com.home.user.center.service.impl;
import com.home.user.center.client.vo.UserGroupResult;
import com.home.user.center.dao.UserDao;
import com.home.user.center.domain.User;
import com.home.user.center.client.service.UserService;
import com.home.user.center.client.vo.UserParam;
import com.home.user.center.client.vo.UserResult;
import com.home.user.center.domain.UserGroup;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.net.InetSocketAddress;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wuzebo1 on 2016/4/21.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public UserResult getUserInfo(UserParam userParam) {
        User user = new User();
        if(userParam != null){
            BeanUtils.copyProperties(userParam,user);
        }
        user = userDao.selectOne(user);
        UserResult userResult = new UserResult();
        if(user != null){
            BeanUtils.copyProperties(user,userResult);
        }
        return userResult;
    }

    @Override
    public UserResult getUserInfoDetial(UserParam userParam){
        User user = new User();
        if(userParam != null){
            BeanUtils.copyProperties(userParam, user);
        }
        user = userDao.selectDetial(user);
        UserResult userResult = new UserResult();
        if(user != null){
            BeanUtils.copyProperties(user,userResult);
        }
        UserGroup userGroup = user.getUserGroup();
        UserGroupResult userGroupResult = new UserGroupResult();
        if(userGroup != null){
            BeanUtils.copyProperties(userGroup, userGroupResult);
            userResult.setUserGroupResult(userGroupResult);
        }

        return userResult;
    }

    @Override
    public List<UserResult> getUserInfoList(UserParam userParam){
        List<UserResult> userResults = new LinkedList<UserResult>();
        User user = new User();
        if(userParam != null){
            BeanUtils.copyProperties(userParam, user);
        }

        List<User> users = userDao.selectList(user);
        for(User u : users){
            UserResult userResult = new UserResult();
            BeanUtils.copyProperties(u,userResult);
            userResults.add(userResult);
        }

        return userResults;
    }

    @Override
    public Integer regUserInfo(UserParam userParam){
        User user = new User();
        if(userParam != null){
            BeanUtils.copyProperties(userParam,user);
        }
        return userDao.insert(user);
    }

    @Override
    public Integer updateUserInfo(UserParam userParam){
        User user = new User();
        if(userParam != null){
            BeanUtils.copyProperties(userParam,user);
        }
        return userDao.updateById(user);
    }

    @Override
    public void createConnection(){
        final ChatServer server = new ChatServer();

        ChannelFuture f = server.start(new InetSocketAddress(2048));
        System.out.println("server start................");
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                server.destroy();
            }
        });
        f.channel().closeFuture().syncUninterruptibly();
    }
}
