package com.boot.service.impl;

import com.boot.pojo.userDetail;
import com.boot.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailService {

    @Autowired
    private com.boot.dao.UserDetailMapper userDetailMapper;

    @Override
    public userDetail selectUserDetailByUserName(String name) {
        return userDetailMapper.selectUserDetailByUserName(name);
    }

    @Override
    public void updateUserDetail(userDetail userDetail) {
        userDetailMapper.updateUserDetail(userDetail);
    }

    @Override
    public void addUserDetail(userDetail userDetail) {
        userDetailMapper.addUserDetail(userDetail);
    }
}
