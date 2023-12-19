package instance;

/**
 * 静态工厂类
 *
 * @author red2222
 * @date 2023/12/18
 */
public class StaticBeanFactory {

    private static BeanClass bean = new BeanClass("通过静态工厂创建");

    private static BeanClass createBean() {
        return bean;
    }
}
