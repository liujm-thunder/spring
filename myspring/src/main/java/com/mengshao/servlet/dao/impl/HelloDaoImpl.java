package com.mengshao.servlet.dao.impl;

import com.mengshao.servlet.dao.HelloDao;

import java.util.Arrays;
import java.util.List;

public class HelloDaoImpl implements HelloDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("张三","李四","赵武","王六");
    }
}
