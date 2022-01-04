package com.mengshao.servlet.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Account {
    @Value("1")
    private Integer id;
    @Value("张三")
    private String name;
    @Value("45")
    private Integer age;
}
