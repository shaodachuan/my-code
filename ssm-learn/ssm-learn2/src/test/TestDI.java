package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TestDIService;

/**
 * 哈哈哈哈
 *
 * @author red2222
 * @date 2023/12/17
 */
public class TestDI {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDIService testDIService = (TestDIService) context.getBean("testDIService");
        testDIService.sayHello();


        TestDIService testDIService1 = (TestDIService) context.getBean("testDIService2");
        testDIService1.sayHello();
        System.out.println(testDIService1);
    }
}
