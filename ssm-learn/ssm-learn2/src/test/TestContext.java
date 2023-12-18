package test;

import dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * XmlApplicationContext创建ApplicationContext
 *
 * @author red2222
 * @date 2023/12/17
 */
public class TestContext {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao dao = (TestDao) context.getBean("test");
        dao.sayHello();
    }
}
