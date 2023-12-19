package test;

import instance.BeanClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 哈哈哈哈
 *
 * @author red2222
 * @date 2023/12/18
 */
public class TestScope {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanClass bean1 = (BeanClass) context.getBean("singletonBean");
        BeanClass bean2 = (BeanClass) context.getBean("singletonBean");
        System.out.println(bean1);
        System.out.println(bean2);

        BeanClass bean3 = (BeanClass) context.getBean("prototypeBean");
        BeanClass bean4 = (BeanClass) context.getBean("prototypeBean");
        System.out.println(bean3);
        System.out.println(bean4);
    }
}
