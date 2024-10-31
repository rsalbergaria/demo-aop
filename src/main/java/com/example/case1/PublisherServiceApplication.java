package com.example.case1;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class PublisherServiceApplication {

    private final KafkaPublisher kafkaPublisher;

    /*
    @Inject
    public PiblisherServiceApplication(@Named("teste") KafkaPublisher kafkaPublisher) {
        this.kafkaPublisher = kafkaPublisher;
    }*/

    @Inject
    public PublisherServiceApplication(KafkaPublisher kafkaPublisher) {
        this.kafkaPublisher = kafkaPublisher;
    }
}
