package com.example.case1;

import io.micronaut.aop.AroundConstruct;
import io.micronaut.aop.ConstructorInterceptor;
import io.micronaut.context.annotation.Type;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@AroundConstruct
@Type(ConstructorInterceptor.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.TYPE})
public @interface InterceptConstructor {
}
