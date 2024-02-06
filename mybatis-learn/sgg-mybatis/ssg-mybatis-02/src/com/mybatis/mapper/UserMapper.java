package com.mybatis.mapper;

import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Mapper接口
 *
 * @author red2222
 * @date 2023/12/30
 */
public interface UserMapper {




    User selectUserById(Integer id);

    User getAllUsers(List<User> userList);


    // 传参 - 实体类
    User selecctByPojo(User user);

    // 传参 - Map
    User selectOneByMap(Map<String, Object> map);

    // 传参 - List集合
    User selectByOneParam(List<User> list);

    // 传参 - 一个字面量
    User getUserByUsername(String username);

    // 传参 - 多个参数
    User getUserByParams(@Param("username") String username, @Param("user") User user);

    // 结果处理 - 一行数据
    Map<String, Object> getPojoById(Integer id);

    // 结果处理 - 多行数据
    List<Map> getAllPojo();

    // 模糊查询 - concat() 方式
    List<User> getUserLike1(String username);

    // 模糊查询 - ${}拼串方式
    List<User> getUserLike2(String username);

    // 模糊查询 - ""方式
    List<User> getUserLike3(String username);

    //  表字段 - 根据参数传入
    String getUserItem(@Param("field") String field,@Param("id") Integer id);

}
