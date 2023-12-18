package test;

import dao.TestDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * XmlBeanFactory
 *
 * @author red2222
 * @date 2023/12/17
 */
public class Test {

    public static void main(String[] args) {
        // 创建容器
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        // 不new，从容器中创建bean
        TestDao dao = (TestDao) beanFactory.getBean("test");
        dao.sayHello();
    }
}
