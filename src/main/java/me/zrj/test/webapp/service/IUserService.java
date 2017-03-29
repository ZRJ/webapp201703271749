package me.zrj.test.webapp.service;

import me.zrj.test.webapp.model.User;

/**
 * ZRJ
 * 2017/3/29
 */
public interface IUserService {
    User getUserById(int userId);

    int updateUser(User user);
}
