package com.boot.service;

import com.boot.pojo.authority;

import java.util.List;

public interface AuthorityService {


    List<authority> selectUserAuthority();

    String selectAuthorityByid(int id);


}
