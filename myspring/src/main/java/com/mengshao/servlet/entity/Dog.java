package com.mengshao.servlet.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Dog {
    @Value("3")
    private Integer id;
    @Value("旺财")
    private String name;
    @Value("5")
    private Integer age;

}
