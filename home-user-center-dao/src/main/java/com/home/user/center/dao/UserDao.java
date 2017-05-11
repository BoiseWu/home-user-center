package com.home.user.center.dao;

import com.home.user.center.domain.User;

import java.io.Serializable;

/**
 * Created by wuzebo1 on 2016/4/21.
 */
public interface UserDao extends BaseDao<User,Long> {
    User selectDetial(User user);
}
