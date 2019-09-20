package com.cxsdt.service;

import com.cxsdt.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * TODO：
 * Created by ${lvwenyang} on {}
 */

@Service
@Component
public class UserServiceImpl implements UserService {

   @Autowired
   private UserDao userDao;

   @Override
   public String save() {
      return userDao.save();
   }
}
