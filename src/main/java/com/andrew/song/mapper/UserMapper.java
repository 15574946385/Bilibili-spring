package com.andrew.song.mapper;

import com.andrew.song.bean.UserBean;

public interface UserMapper {

    UserBean getInfo(String name,String password);

}
