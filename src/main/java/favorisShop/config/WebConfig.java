package favorisShop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.io.File;

/**
 * Created by volodymyr on 12.07.17.
 */
@Configuration
@EnableWebMvc
@ComponentScan("favorisShop.*")
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public MultipartResolver multipartResolver(){
        return new StandardServletMultipartResolver();
    }

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver resolver =  new InternalResourceViewResolver();
        resolver.setPrefix("/pages/"); // /pages/
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/css/**")
                .addResourceLocations("/styles/");
        registry.
                addResourceHandler("/img/**")
                .addResourceLocations("file:" + System.getProperty("user.home") + File.separator + "images" + File.separator);
        registry
                .addResourceHandler("/js/**")
                .addResourceLocations("/script/");
    }

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }


}
