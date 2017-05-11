package com.home.user.center.client.service;

import com.home.user.center.client.vo.MessageParam;
import com.home.user.center.client.vo.MessageResult;

import java.util.List;

/**
 * Created by wuzebo1 on 2016/6/9.
 */
public interface MessageService {
    Integer insertMessage(MessageParam messageParam);
    List<MessageResult> getMessageList(MessageParam messageParam);
}
