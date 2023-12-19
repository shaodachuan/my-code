package test;

import instance.BeanClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestInstance
 *
 * @author red2222
 * @date 2023/12/18
 */
public class TesInstance {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanClass bean1 = (BeanClass) context.getBean("constructorBean");
        System.out.println(bean1 + bean1.message);

        BeanClass bean2 = (BeanClass) context.getBean("staticFactoryBean");
        System.out.println(bean2 + bean2.message);

        BeanClass bean3 = (BeanClass) context.getBean("factoryBean");
        System.out.println(bean3 + bean3.message);
    }
}
