package com.boot.service;

import com.boot.pojo.Blacklist;

import java.util.List;

public interface BlacklistService {

    List<Blacklist> selectBlackList();

    void deleteBlackListByIp(String ip);

    void addBlackList(Blacklist blacklist);

    boolean checkIpHasBlack(String ip); //检查ip是否在黑名单

    int selectBlackCount();

    void updateBlackIp(String oldIp, String newIp);
}
