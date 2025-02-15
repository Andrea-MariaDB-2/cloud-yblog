package com.boot.service.impl;

import com.boot.pojo.Blacklist;
import com.boot.service.BlacklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlacklistServiceImpl implements BlacklistService {

    @Autowired
    private com.boot.dao.BlacklistMapper blacklistMapper;

    @Override
    public List<Blacklist> selectBlackList() {
        return blacklistMapper.selectBlackList();
    }

    @Override
    public void deleteBlackListByIp(String ip) {
        blacklistMapper.deleteBlackListByIp(ip);
    }

    @Override
    public void addBlackList(Blacklist blacklist) {
        blacklistMapper.addBlackList(blacklist);
    }

    @Override
    public boolean checkIpHasBlack(String ip) {
        String blackip = blacklistMapper.selectBlackListByIp(ip);
        if (blackip==null||blackip.equals("")) { //为true，说明这个ip不在黑名单
            return false;
        } else {
            return true;
        }

    }

    @Override
    public int selectBlackCount() {
        return blacklistMapper.selectBlackCount();
    }

    @Override
    public void updateBlackIp(String oldIp, String newIp) {
        blacklistMapper.updateBlackIp(oldIp, newIp);
    }
}
