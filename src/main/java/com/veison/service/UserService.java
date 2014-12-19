package com.veison.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.veison.dao.UserDaoI;
import com.veison.model.User;

@Service("userService")
@Transactional
public class UserService // 之前这里写错成了UserServiceImpl，谢谢wangdianyong的提醒，此处已做修改
{
  // 自动注入dao
  @Autowired
  private UserDaoI<User> userDao;

  public void addUser(User user) {
    userDao.save(user);
  }

}
