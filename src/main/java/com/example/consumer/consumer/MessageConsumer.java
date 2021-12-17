package com.example.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageConsumer {

    @RabbitListener(queues = "${rabbit.queue1}", containerFactory = "jsaFactory")
    public void handleMessage(org.springframework.amqp.core.Message m, @Payload Message message){

        log.info("Mensagem recebida fila 1:{}",message.getMessage());

    }

    @RabbitListener(queues = "${rabbit.queue2}", containerFactory = "jsaFactory")
    public void handleMessage2(org.springframework.amqp.core.Message m, @Payload Message message){

        log.info("Mensagem recebida fila 2:{}",message.getMessage());

    }
}
