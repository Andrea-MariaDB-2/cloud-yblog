package com.boot.service.impl;

import com.boot.pojo.user_authority;
import com.boot.service.UserAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAuthorityServiceImpl implements UserAuthorityService {

    @Autowired
    private com.boot.dao.UserAuthorityMapper userAuthorityMapper;

    @Override
    public void changeUserAuthority(user_authority user_authority) {
        userAuthorityMapper.changeUserAuthority(user_authority);
    }

    @Override
    public int selectAuthorityID(int userid) {
        return userAuthorityMapper.selectAuthorityID(userid);
    }
}
