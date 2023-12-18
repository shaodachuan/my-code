package service;

import dao.TestDIDao;

/**
 * 哈哈哈哈
 *
 * @author red2222
 * @date 2023/12/17
 */
public class TestDIServiceImpl implements TestDIService{

    private TestDIDao testDIDao;

    // 使用构造方法注入，需要提供带参数构造方法
    public TestDIServiceImpl(TestDIDao testDIDao) {
        super();
        this.testDIDao = testDIDao;
    }

    @Override
    public void sayHello() {
        testDIDao.sayHello();
        System.out.println("testDIService sayHello!");
    }
}
