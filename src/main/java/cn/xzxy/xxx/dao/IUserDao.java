package cn.xzxy.xxx.dao;

import cn.xzxy.xxx.pojo.User;

public interface IUserDao extends IBaseDao<User> {
    public User login(String username);
}
