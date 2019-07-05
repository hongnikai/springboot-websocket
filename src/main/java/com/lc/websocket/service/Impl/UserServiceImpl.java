package com.lc.websocket.service.Impl;

import com.lc.websocket.bean.User;
import com.lc.websocket.dao.UserDao;
import com.lc.websocket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

        @Autowired
        private UserDao userDao;

        public List<Map<String,Object>> selectAllUser(){
            return userDao.selectAllUser();
        }

        @Transactional
        public List<Map<String,Object>> selectPriceInnerJoinPriceOrder(Map<String,Object> map){
            return userDao.selectPriceInnerJoinPriceOrder(map);
        }

        @Transactional
        public void insertUsers(List list) {
            userDao.insertUsers(list);
        }

        @Transactional
        public User findUserByAccountAndPassword(String username, String password) {
              User user =  userDao.findUserByAccountAndPassword(username,password);
            return user;
        }

        @Transactional
        public User findUserByUserId(String id) {
            User user =userDao.findUserByUserId(id);
            return user;
        }



}
