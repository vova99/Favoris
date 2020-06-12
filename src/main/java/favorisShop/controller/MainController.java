package favorisShop.controller;

import favorisShop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class MainController {

    @Autowired
    UserService userService;

    @GetMapping("/index")
    public String getIndex(Map<String,String> model){

        return "index";
    }
    @GetMapping("/login")
    public String getLogin(){
        return "error";
    }
    @PostMapping("/login")
    public String gtLogin(){
        return "login";
    }

//    @RequestMapping("/login")
//    public String index() {
//        return "test";
//    }
//    @RequestMapping("/login")
//    @ResponseBody
//    String home(){
//        return "Hello";
//    }


//    @GetMapping("/error")
//    @ResponseBody
//    public  String getSomeError(){
//        return "Something bad";
//    }
    @RequestMapping("/error")
    @ResponseBody
    public  String postSomeError(){
        return "Something bad";
    }

    @PostMapping("/index")
    public String postIndex(Map<String,String> model){
        UserDetails userDetails;
        Object details = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (details instanceof UserDetails) {
            userDetails = (UserDetails) details;
            if (userDetails != null) {
                model.put("abc",userService.selectByUsername(userDetails.getUsername()).getRoles().toString());
            }
        }
        return "index";
    }

}
