package com.ql.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by smallgoodboy on 2017/8/16.
 */
public class TestRun {
    public static void main(String args[]) {
        ApplicationContext cx = new ClassPathXmlApplicationContext("classpath:spring-root.xml");
        TestDao testDao = (TestDao)cx.getBean("testDao");
        testDao.insert("eeee");
    }
}
