package com.example;


import com.example.case1.PublisherServiceApplication;
import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.context.event.StartupEvent;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class OnStart implements ApplicationEventListener<StartupEvent> {

    @Inject
    PublisherServiceApplication publisherServiceApplication;

    @Override
    public void onApplicationEvent(StartupEvent event) {
    }
}


