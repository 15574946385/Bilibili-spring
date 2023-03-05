package com.andrew.song.service;

import com.andrew.song.bean.UserBean;

public interface UserService {

    UserBean loginIn(String name,String password);

}
