package test;

import dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * FileSystemApplicatonContext
 *
 * @author red2222
 * @date 2023/12/17
 */
public class TestContext2 {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("E:\\my-code\\ssm-learn\\ssm-learn2\\src\\applicationContext.xml");
        TestDao dao = (TestDao) context.getBean("test");
        dao.sayHello();
    }
}
