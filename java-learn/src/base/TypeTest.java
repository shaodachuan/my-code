package base;

import java.util.ArrayList;

/**
 * 基本数据类型
 * 1. 在使用时候，很少使用short、byte，会用int，因为：short运算后，自动转int,赋给short要强转、char不能自动转换short
 * 2. 对应float、double存在精度问题，运算后，误差变大，不能精确表示，所以，金额，要用BigDecimal。
 *
 * 数据类型转换
 * 1. boolean不能强制转换int
 *
 * IntegerCache
 * 1. Integer有缓存池，范围是-127-128。调用valueOf,从缓存池取，取到直接返回。取不到，new一个返回
 * 2. IntegerCache是静态内部类   1. 首先，根据property  2. 确认high  > 127，并且high < MAX-128  3. 写一个assert
 * 3. 对于assert， 使用 java -ea ，运行时候，开启断言，保证程序的正确性。
 *
 * 运算符
 * 1. 算数运算符 - 对于10 /3 ,结果是3，因为整数除法，结果还是整数。
 * 2. 整数除0，会抛异常，所以，在除0运算时候，判断除数是否是0，以免抛出异常。
 *
 *
 * @author red2222
 * @date 2023/12/16
 */
public class TypeTest {

    /**
     *  基本数据类型
     */
    public static void typeFunc() {
        // 字面量可以直接赋值给short
        short a = 12;

        // float
        float sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += 0.01f;
        }
        System.out.println(sum);
    }

    /**
     * Integer的缓存
     */
    public static void intCacheFunc(){
        Integer x = new Integer(18);
        Integer y = new Integer(18);
        System.out.println(x == y);  // false

        Integer z = Integer.valueOf(18);
        Integer k = Integer.valueOf(18);
        System.out.println(z == k); // true

        Integer m = Integer.valueOf(300);
        Integer p = Integer.valueOf(300);
        System.out.println(m == p); // false
    }

    /**
     * assert 是断言， 保证程序的正确性。
     */
    public static void assetFunc(){
        int high = 126;
        assert high > 127;
    }

    /**
     * 运算符
     */
    public  static void symbolFunc(){
        System.out.println(10.0 / 0.0);  // INFINITY
        System.out.println(0.0 / 0.0);  // NAN
        System.out.println(0 / 0);      // java.lang.ArithmeticException: by Zero - 算数异常

    }

    public static void symbolFunc2(){
        System.out.println(Integer.toBinaryString(60));
        System.out.println(Integer.toBinaryString(13));
        System.out.println(Integer.toBinaryString(-1));
    }

    /**
     * switch案例
     */
    public static void switchFunc(){


        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break;
                }
                System.out.println(i + " " + j);
            }
        }

    }

    public static void main(String[] args) {
        switchFunc();
    }
}















