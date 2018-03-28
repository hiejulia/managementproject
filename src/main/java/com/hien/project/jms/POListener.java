package com.hien.project.jms;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class POListener implements MessageListener {

    // message listener

    @Override
    public void onMessage(Message message) {
        String messageBody= new String(message.getBody());

    }
}