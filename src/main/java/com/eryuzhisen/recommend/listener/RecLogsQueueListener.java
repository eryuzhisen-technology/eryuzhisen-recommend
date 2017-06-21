package com.eryuzhisen.recommend.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import com.eryuzhisen.utils.StringUtil;
import com.eryuzhisen.utils.log.ErYuLogger;

public class RecLogsQueueListener implements MessageListener{

    @Override
    public void onMessage(Message message) {
        String messageStr = new String(message.getBody());
        try {
            if(StringUtil.isNotBlank(messageStr)) {
                
            } 
        } catch (Exception e) {
            ErYuLogger.error("RecLogsQueueListener error:",e);
            ErYuLogger.error("message json:"+messageStr);
        }
    }
}
