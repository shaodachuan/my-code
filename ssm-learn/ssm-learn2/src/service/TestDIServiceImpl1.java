package service;

import dao.TestDIDao;

/**
 * 哈哈哈哈
 *
 * @author red2222
 * @date 2023/12/17
 */
public class TestDIServiceImpl1 implements TestDIService{

    private TestDIDao testDIDao;

    public void setTestDIDao(TestDIDao testDIDao) {
        this.testDIDao = testDIDao;
    }

    @Override
    public void sayHello() {
        testDIDao.sayHello();
        System.out.println("TestDIService2: sayHello!");
    }
}
