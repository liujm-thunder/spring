package com.mengshao.servlet.service.impl;

import com.mengshao.servlet.beanfactory.BeanFactory;
import com.mengshao.servlet.dao.HelloDao;
import com.mengshao.servlet.service.HelloService;

import java.util.List;

public class HelloServiceImpl implements HelloService {

    private HelloDao helloDao = (HelloDao) BeanFactory.getBean("helloDao");

    public static void main(String[] args) {
        HelloDao dao = (HelloDao) BeanFactory.getBean("helloDao");
        for (int i = 0; i < 10; i++) {
            System.out.println(dao);
        }
    }

    @Override
    public List<String> findAll() {

        return helloDao.findAll();
    }
}
