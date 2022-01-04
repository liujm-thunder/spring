package com.mengshao.servlet.beanfactory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {

    private static Properties properties;

    private static Map<String,Object> cache;

    static {
        properties = new Properties();
        try {
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        cache = new HashMap<>();
    }

    //单例 缓存 bean
    public static Object getBean(String beanName){
        if (!cache.containsKey(beanName)){
            synchronized (BeanFactory.class){
                if (!cache.containsKey(beanName)){
                    String value = properties.getProperty(beanName);
                    try {
                        Class clazz = Class.forName(value);
                        Object result = clazz.getConstructor(null).newInstance(null);
                        cache.put(beanName,result);
                    }catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return cache.get(beanName);
    }


}
