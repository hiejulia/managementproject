package com.hien.project.jms;


import java.util.Date;

import com.sun.jersey.api.spring.Autowire;
import org.springframework.amqp.core.AmqpTemplate;


public class POSender {

//    @Autowired
    private AmqpTemplate poTemplate;

    public void updatePO(){

        for (int i = 0; i < 10; i++)

            poTemplate.convertAndSend("erp.po.update.", "Message # " +i +" on "+ new Date());// send
    }
}