package cn.yz.fresh.controller;

import cn.yz.fresh.pojo.Navigate;
import cn.yz.fresh.service.INavigateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Kim昌完 on 2017/8/26.
 */
@Controller
@RequestMapping("indexResource")
public class IndexController {
    private INavigateService navigateServiceImpl;
    @RequestMapping(value = "navigateResource",method= RequestMethod.GET)
    public String navigateResource(){
        Navigate navigate = navigateServiceImpl.queryAll();
        return "navigate";
    }

}
