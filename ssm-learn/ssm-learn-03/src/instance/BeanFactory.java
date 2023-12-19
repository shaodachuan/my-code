package instance;

/**
 * 实例工厂
 *
 * @author red2222
 * @date 2023/12/18
 */
public class BeanFactory {
    public BeanClass cteateBean(){
        return new BeanClass("调用实例工厂创建");
    }
}
