package com.home.user.center.service.impl;

import com.home.user.center.client.service.MessageService;
import com.home.user.center.client.vo.MessageParam;
import com.home.user.center.client.vo.MessageResult;
import com.home.user.center.dao.MessageDao;
import com.home.user.center.domain.Message;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wuzebo1 on 2016/6/9.
 */
@Service("messageService")
public class MessageServiceImpl implements MessageService {

    @Resource
    private MessageDao messageDao;

    @Override
    public Integer insertMessage(MessageParam messageParam) {
        Message message = new Message();
        if(messageParam != null){
            BeanUtils.copyProperties(messageParam, message);
        }
        return messageDao.insert(message);
    }

    @Override
    public List<MessageResult> getMessageList(MessageParam messageParam) {
        Message message = new Message();
        if(messageParam != null){
            BeanUtils.copyProperties(messageParam, message);
        }
        List<Message> messages = messageDao.selectList(message);
        List<MessageResult> messageResultList = new LinkedList<MessageResult>();
        for(Message m : messages){
            MessageResult messageResult = new MessageResult();
            if(m != null){
                BeanUtils.copyProperties(m, messageResult);
                messageResultList.add(messageResult);
            }
        }
        return messageResultList;
    }
}
