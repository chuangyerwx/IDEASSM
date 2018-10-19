package springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.entity.User;
import springboot.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

//@Controller                   //声明当前类为控制器
//@ResponseBody                 //加在方法上说明返回值会被序列化成json
//当前注解为组合注解
@Controller               //声明当前类为控制器并且所有方法返回json
@RequestMapping("/test")
public class TestController {
        //
    Logger l = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private UserService us;

    @RequestMapping("/test")
    public String test(){

        return "index";
    }

    @RequestMapping("/insert")
    public void insert(User u){
        us.insert(u);
    }

    @RequestMapping("/selectAll")
    public String selectAll(HttpServletRequest req){

        List<User> list = us.selectAll();
        req.setAttribute("User",list);

        l.info("-----------------------------这是info");
        return "index";
    }

}
