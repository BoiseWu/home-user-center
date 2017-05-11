package com.home.user.center.web;

import com.home.user.center.client.service.MessageService;
import com.home.user.center.client.vo.MessageParam;
import com.home.user.center.client.vo.MessageResult;
import com.home.user.center.client.vo.PictureParam;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wuzebo1 on 2016/6/9.
 */
public class MessageServiceImplTest  extends BaseTest{

    @Resource
    private MessageService messageService;

    @Test
    public void  insertMessage(){
        MessageParam messageParam = new MessageParam();
        messageParam.setUserId(5l);
        messageParam.setToUserId(6l);
        messageParam.setMessage("太好 了");
        messageParam.setType(1);
        Integer integer = messageService.insertMessage(messageParam);
        System.out.print(integer);
    }
    @Test
    public void  getMessages(){
        MessageParam messageParam = new MessageParam();
        messageParam.setUserId(5l);
        List<MessageResult> messageList = messageService.getMessageList(messageParam);
        System.out.print(messageList);

    }
}
