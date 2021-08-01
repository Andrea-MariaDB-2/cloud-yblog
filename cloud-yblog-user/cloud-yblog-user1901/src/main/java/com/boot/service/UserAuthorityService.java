package com.boot.service;

import com.boot.pojo.user_authority;

public interface UserAuthorityService {

    void changeUserAuthority(user_authority user_authority);

    int selectAuthorityID(int userid);
}
