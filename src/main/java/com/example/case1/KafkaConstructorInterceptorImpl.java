package com.example.case1;

import io.micronaut.aop.ConstructorInterceptor;
import io.micronaut.aop.ConstructorInvocationContext;
import io.micronaut.aop.InterceptorBean;
import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

@Singleton
@InterceptorBean(InterceptConstructor.class)
@Slf4j
public class KafkaConstructorInterceptorImpl implements ConstructorInterceptor<KafkaPublisher> {

    @Override
    public @NonNull KafkaPublisher intercept(@NonNull ConstructorInvocationContext<KafkaPublisher> context) {
        KafkaPublisher kafkaPublisher = context.proceed();

        System.out.println("Attempting to create instance of" + context.getDeclaringType().getName());
        System.out.println("Successfully created instance of" + context.getDeclaringType().getName());

        return kafkaPublisher;
    }

}
