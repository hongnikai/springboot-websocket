package com.lc.websocket.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * user 表实体类
 * @author lc
 * @create time 2019-07-03
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    private Integer id;
    private String name;
    private String userUuid;   //用户UUID
    private String username;    //用户名
    private String password;    //用户密码
    private String email;       //用户邮箱
    private String telephone;   //电话号码
    private String role;        //用户角色
    private String image;       //用户头像
    private String lastIp;     //上次登录IP
    private String lastTime;   //上次登录时间


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }


}
