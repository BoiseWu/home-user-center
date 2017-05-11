package com.home.user.center.web;
/**
 * Created by IntelliJ IDEA.
 * User: bjyfzhangmeng
 * Date: 13-4-24
 * Time: 上午11:54
 * To change this template use File | Settings | File Templates.
 */

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: ZhangFeng
 * Date: 2010-8-7
 * Time: 17:27:19
 */
public abstract class BaseTest {

    protected Logger log = Logger.getLogger(this.getClass());
    protected static ApplicationContext appContext;

    @BeforeClass
    public static void setUp() throws Exception {
        try {
            long start = System.currentTimeMillis();
            System.out.println("正在加载配置文件...");

            appContext =  new ClassPathXmlApplicationContext(new String[]{"spring-config.xml"});

            System.out.println("配置文件加载完毕,耗时：" + (System.currentTimeMillis() - start));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(BaseTest.class.getResource("/"));
    }
    protected boolean setProtected() {
        return false;
    }

    @Before
    public void autoSetBean() {
        appContext.getAutowireCapableBeanFactory().autowireBeanProperties(this, DefaultListableBeanFactory.AUTOWIRE_BY_NAME, false);
    }

    @AfterClass
    public static void tearDown() throws Exception {
    }
}

