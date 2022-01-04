package com.mengshao.servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class springContext {


//    public static void main(String[] args) {
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.mengshao.servlet.entity");
//        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
//            System.out.println(beanDefinitionName);
//        }
//
//
//        System.out.println(applicationContext.getBean("account"));
//        System.out.println(applicationContext.getBean("dog"));
//
//
//    }

    public static void main(String[] args) {
        String str = "艺术品、藏品、音乐、版权、衍生品";
        String[] devices = str.split("、");
        for (String device : devices) {
            System.out.println("INSERT INTO `NFT_goods_type` (`name`)VALUES ('"+device.trim()+"');");
        }
    }


}
