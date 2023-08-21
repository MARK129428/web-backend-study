package com.hhk.hanlinxuefu.dao;

import com.hhk.hanlinxuefu.entry.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {

    User login(@Param("id") Integer id);
}
