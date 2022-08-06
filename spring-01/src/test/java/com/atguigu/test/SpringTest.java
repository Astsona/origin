package com.atguigu.test;

import com.atguigu.ioc.pojo.Beans;
import com.atguigu.ioc.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    /* 小试牛刀 */
    @Test
    public void testBeans(){
        /* 用于加载 Spring 配置文件、创建和初始化所有对象 */
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc/beans.xml");
        /* 获取 Bean */
        Beans beans = context.getBean("beans", Beans.class);
        beans.test();
    }

    /* Student 属性注入 setter*/
    @Test
    public void testSetter(){
        /* 用于加载 Spring 配置文件、创建和初始化所有对象 */
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc/beans.xml");
        /* 获取 Bean */
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }


}
