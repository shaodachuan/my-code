package test;

import dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Ioc：不直接new,从Spring容器(Ioc)容器中获取，（使用Ioc容器注入）
 *
 * @author red2222
 * @date 2023/12/17
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao dao = (TestDao)app.getBean("test");
        dao.sayHello();

    }
}
