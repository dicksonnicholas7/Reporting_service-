package com.seaborne.Reporting_service.ClientServiceConsumer;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

public class ClientServiceInfoConsumer implements MessageListener  {
    @Override
    public void onMessage(Message message, byte[] pattern) {
        System.out.println("Received >> " + message +  ", " + Thread.currentThread().getName() );
    }
}
