package com.example.case1;

import jakarta.inject.Singleton;

@Singleton
public class KafkaPublisher {

    @InterceptConstructor
    public KafkaPublisher() {
    }

}