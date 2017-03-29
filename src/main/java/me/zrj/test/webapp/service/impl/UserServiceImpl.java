package me.zrj.test.webapp.service.impl;

import me.zrj.test.webapp.dao.UserMapper;
import me.zrj.test.webapp.model.User;
import me.zrj.test.webapp.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ZRJ on 2017/3/29.
 */

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userDao;
    @Override
    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }

    @Override
    public int updateUser(User user) {
        return this.userDao.updateByPrimaryKeySelective(user);
    }
}
