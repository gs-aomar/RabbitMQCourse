package com.gainsight.rabbitlistnerproject;

import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

import java.util.List;

public class rabbitMQMessageListner implements MessageListener
{
    @Override
    public void onMessage(Message message) {
        System.out.println("message = " +new String(message.getBody()));
    }
}
