package com.mybatis.mapper;

import com.mybatis.pojo.Emp;

/**
 * 哈哈哈哈
 *
 * @author red2222
 * @date 2024/2/5
 */
public interface EmpMapper {

    // 大小写处理
    Emp getEmpById1(Integer id);

    Emp getEmpById2(Integer id);

    Emp getEmpById3(Integer id);

    // 别名
    Emp getEmpAlias(Integer id);

}
