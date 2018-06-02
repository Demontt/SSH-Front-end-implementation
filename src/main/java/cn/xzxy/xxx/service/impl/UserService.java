package cn.xzxy.xxx.service.impl;

import cn.xzxy.xxx.dao.IUserDao;
import cn.xzxy.xxx.exception.UserException;
import cn.xzxy.xxx.pojo.User;
import cn.xzxy.xxx.service.IUserService;
import cn.xzxy.xxx.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDao userDao;

    public User login(String username, String password) {
        // TODO Auto-generated method stub
        User user = userDao.login(username);
        if(user == null) {
            throw new UserException("用户名不存在");
        }
        if(!user.getPassword().equals(CodeUtil.getMD5Encoding(password))) {
            throw new UserException("密码错误");
        }
        return user;
    }
}
