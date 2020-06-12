package favorisShop;

import favorisShop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.Map;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages = {"favorisShop.config","favorisShop.controller","favorisShop.dao"})
public class StarClass {

    public static void main(String[] args) {
        SpringApplication.run(StarClass.class,args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
    @Autowired
    UserService userService;

    @GetMapping("/index")
    public String getIndex(Map<String,String> model){

        return "index";
    }
    @GetMapping("/login")
    public String getLogin(){
        return "test";
    }
    @PostMapping("/login")
    public String gtLogin(){
        return "test";
    }

//    @RequestMapping("/login")
//    public String index() {
//        return "test";
//    }

    @GetMapping("/error")
    public  String getSomeError(){
        return "error";
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
