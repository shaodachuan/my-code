package com.mybatis.pojo.emp;

import org.apache.ibatis.type.Alias;

/**
 * 哈哈哈哈
 *
 * @author red2222
 * @date 2024/2/5
 */
@Alias("pojoEmp")
public class Emp {

    private Integer id;
    private String empName;
    private String email;

    public Emp() {
    }

    public Emp(Integer id, String empName, String email) {
        this.id = id;
        this.empName = empName;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public Emp setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getEmpName() {
        return empName;
    }

    public Emp setEmpName(String empName) {
        this.empName = empName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Emp setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
