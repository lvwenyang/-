package com.cxsdt.controller;

import com.cxsdt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO：
 * Created by ${lvwenyang} on {}
 */

@Controller
@RequestMapping("/user")
@ComponentScan
public class UserController {

   @Autowired
   private UserService userService;

   @RequestMapping("/save")
   public String save(Model model){
      String save = userService.save();
      model.addAttribute("save",save);
      return "list";
   }
}
