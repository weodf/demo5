package com.example.entity;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues="hello")
public class Receiver {

    @RabbitHandler
    public void receiver(String str) {
        System.out.println(".....");
        System.out.println("Receiver says:[" + str + "]");
    }
}
