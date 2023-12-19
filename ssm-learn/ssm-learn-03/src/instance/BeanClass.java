package instance;

/**
 * BeanClass
 *
 * @author red2222
 * @date 2023/12/18
 */
public class BeanClass {
    public String message;

    public BeanClass() {
        message = "构造方法实例化Bean";
    }

    public BeanClass(String message) {
        this.message = message;
    }
}
