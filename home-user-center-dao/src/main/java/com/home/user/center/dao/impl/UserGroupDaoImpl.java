package com.home.user.center.dao.impl;

import com.home.user.center.dao.UserGroupDao;
import com.home.user.center.domain.User;
import com.home.user.center.domain.UserGroup;
import org.springframework.stereotype.Repository;

/**
 * Created by wuzebo1 on 2016/4/21.
 */
@Repository("UserGroupDao")
public class UserGroupDaoImpl extends BaseDaoImpl<UserGroup, Long> implements UserGroupDao {

    private final static String NAMESPACE = "com.home.user.center.dao.UserGroupDao.";
    @Override
    public String getNameSpace(String statement) {
        return NAMESPACE+statement;
    }
}
