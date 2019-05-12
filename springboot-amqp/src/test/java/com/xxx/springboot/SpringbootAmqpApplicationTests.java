package com.xxx.springboot;

import com.xxx.springboot.bean.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootAmqpApplicationTests {


    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    AmqpAdmin amqpAdmin;

    /**
     * 单播  点对点
     */
    @Test
    public void directSend() {
        Map map = new HashMap();
        map.put("msg", "我的第一个消息");
        map.put("data", Arrays.asList("嘻嘻嘻", 123, true))
        ;
        rabbitTemplate.convertAndSend("exchange.direct", "xxx.news", new Book("jVM", "周志明"));
    }

    /**
     * 接收消息 单播  点对点
     */
    @Test
    public void directReceive() {

        Object o = rabbitTemplate.receiveAndConvert("xxx.news");

        System.out.println("--------------------------------");
        System.out.println(o.getClass());
        System.out.println(o);
    }


    /**
     * 广播
     */
    @Test
    public void fanoutSend() {
        System.out.println("..........发送.......");
        rabbitTemplate.convertAndSend("exchange.fanout", "", new Book("吾皇万岁", "李世民"));
        System.out.println(".........发送完成....");

    }

    /**
     * 广播
     */
    @Test
    public void fanoutRecvice() {
        Object o = rabbitTemplate.receiveAndConvert("xxx");
        System.out.println("--------------------------------");
        System.out.println(o.getClass());
        System.out.println(o);

    }

    @Test
    public void careateExchange() {
//        Exchange exchange=new DirectExchange("amqpAdmin.exchange");
//        amqpAdmin.declareExchange(exchange);

//        amqpAdmin.declareQueue(new Queue("amqpAdmin.Queue",true));
        amqpAdmin.declareBinding(new Binding("amqpAdmin.Queue", Binding.DestinationType.QUEUE, "amqpAdmin.exchange", "amqpAdmin.haha", null));
    }


}