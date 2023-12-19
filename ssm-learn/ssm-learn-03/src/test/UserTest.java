package test;

import assemble.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 哈哈哈哈
 *
 * @author red2222
 * @date 2023/12/19
 */
public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = (User) context.getBean("user1");
        System.out.println(user1);
    }
}
