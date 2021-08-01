package com.boot.service.impl;

import com.boot.pojo.authority;
import com.boot.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    private com.boot.dao.AuthorityMapper authorityMapper;

    @Override
    public List<authority> selectUserAuthority() {
        return authorityMapper.selectUserAuthority();
    }

    @Override
    public String selectAuthorityByid(int id) {
        return authorityMapper.selectAuthorityByid(id);
    }
}
