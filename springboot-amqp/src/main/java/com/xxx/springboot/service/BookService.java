package com.xxx.springboot.service;

import com.xxx.springboot.bean.Book;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @RabbitListener(queues = "xxx.news")
    public void receive(Book book) {
        System.out.println("收到消息--" + book);
    }
    @RabbitListener(queues = "xxx")
    public void receive2(Message message) {
        System.out.println("message.getBody()-------" + message.getBody());
        System.out.println("message.getMessageProperties()-------" + message.getMessageProperties());
    }
}
