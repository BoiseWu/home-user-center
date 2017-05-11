package com.home.user.center.dao.impl;

import com.home.user.center.dao.BaseDao;
import com.home.user.center.dao.UserDao;
import com.home.user.center.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by wuzebo1 on 2016/4/21.
 */
@Repository("UserDao")
public class UserDaoImpl extends BaseDaoImpl<User, Long> implements UserDao {

    private final static String NAMESPACE = "com.home.user.center.dao.UserDao.";
    @Override
    public String getNameSpace(String statement) {
        return NAMESPACE+statement;
    }

    @Override
    public User selectDetial(User user){
       return this.sqlTemplate.selectOne(getNameSpace("selectDetial"), user);
    }
}
