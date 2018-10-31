package com.syt.springboot.dao;

import com.syt.springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 0200077
 * @create 2018-10-30 16:19
 **/
public interface UserMapper {

    void insertUser(User user);
}
