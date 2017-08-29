package cn.yz.fresh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user_action")
public class IuserController {

@RequestMapping("islogin")
    public String isLogin(User user,String valcode, HttpSession session){
    String username = user.getUsername();
    String userPwd = user.getUserPwd();
    System.out.println(username);
    System.out.println(userPwd);
    String o = (String) session.getAttribute("key");
    System.out.println(o);
    System.out.println(valcode);
    return  "";
    }
}
