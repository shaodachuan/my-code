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
    private String name;
    private int age;
    private Integer money;
    private boolean male;


    public void setTestDIDao(TestDIDao testDIDao) {
        this.testDIDao = testDIDao;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public void setMale(boolean male) {
        male = male;
    }

    @Override
    public String toString() {
        return "TestDIServiceImpl1{" +
                "testDIDao=" + testDIDao +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", male=" + male +
                '}';
    }

    @Override
    public void sayHello() {
        testDIDao.sayHello();
        System.out.println("TestDIService2: sayHello!");
    }



}
