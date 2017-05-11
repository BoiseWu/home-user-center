package com.home.user.center.dao.impl;

import com.home.user.center.dao.MessageDao;
import com.home.user.center.domain.Message;
import org.springframework.stereotype.Repository;

/**
 * Created by wuzebo1 on 2016/6/9.
 */
@Repository
public class MessageDaoImpl extends BaseDaoImpl<Message, Long> implements MessageDao {
    private final static String NAMESPACE = "com.home.user.center.dao.MessageDao.";
    @Override
    public String getNameSpace(String statement) {
        return NAMESPACE+statement;
    }
}
