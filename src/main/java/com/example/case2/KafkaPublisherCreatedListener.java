package com.example.case2;

import com.example.case1.KafkaPublisher;
import io.micronaut.context.event.BeanCreatedEvent;
import io.micronaut.context.event.BeanCreatedEventListener;
import jakarta.inject.Singleton;

@Singleton
public class KafkaPublisherCreatedListener implements BeanCreatedEventListener<KafkaPublisher> {

    @Override
    public KafkaPublisher onCreated(BeanCreatedEvent<KafkaPublisher> event) {
        KafkaPublisher kafkaPublisher = event.getBean();
        System.out.println("KafkaPublisherCreatedListener - Attempting to create instance of " + kafkaPublisher.getClass().getName());
        System.out.println("KafkaPublisherCreatedListener - Successfully created instance of " + kafkaPublisher.getClass().getName());
        return kafkaPublisher;
    }
}
