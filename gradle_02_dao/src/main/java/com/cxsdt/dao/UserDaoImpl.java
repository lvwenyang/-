package com.cxsdt.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * TODO：
 * Created by ${lvwenyang} on {}
 */

@Repository
@Component
public class UserDaoImpl implements UserDao{

   @Override
   public String save() {
      return "保存成功!";
   }
}
