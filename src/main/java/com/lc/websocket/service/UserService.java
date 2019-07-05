package com.lc.websocket.service;

import com.lc.websocket.bean.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<Map<String,Object>> selectAllUser();

    List<Map<String,Object>> selectPriceInnerJoinPriceOrder(Map<String, Object> map);

    void insertUsers(List list);

    User findUserByAccountAndPassword(String username, String password);

    User findUserByUserId(String id);

}
