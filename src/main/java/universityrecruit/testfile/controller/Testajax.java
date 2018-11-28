package universityrecruit.testfile.controller;

import com.each.common.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import universityrecruit.testfile.entity.User;

import java.util.Map;

/**
 * Created by dc on 2018/10/4.
 */
@Controller
@RequestMapping("/csol")
public class Testajax extends BaseController{

    @RequestMapping("/totest")
    public String totest(){
        return "testajax/testajax";
    }

    @RequestMapping("/testajax")
    @ResponseBody
    public User testajax(String en){
//        System.out.println(user);
        System.out.println(en);
        Map var3 = (Map)this.gson.fromJson(en, Map.class);
        System.out.println(var3);
        User user=new User();
        user.setName((String) var3.get("name"));
        user.setPassword((String) var3.get("pwd"));
        return user;
    }
}
