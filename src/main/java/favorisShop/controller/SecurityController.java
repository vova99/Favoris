package favorisShop.controller;

import favorisShop.entity.Role;
import favorisShop.entity.User;
import favorisShop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.Enumerated;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Controller
public class SecurityController {

    @Autowired
    UserService userService;

//    @GetMapping("/registration")
//    public String getRegistry(){
//        return "registration";
//    }


    @PostMapping("/registration")
    public String addNewUser(User user, Map<String,Object> model){
        User userFromDB = userService.selectByUsername(user.getUsername());
        if(userFromDB!=null){
            model.put("message","User alredy exists!");
            return "registration";
        }

        user.setActive(true);
        userService.save(user);


        return "redirect:/";
    }


}
