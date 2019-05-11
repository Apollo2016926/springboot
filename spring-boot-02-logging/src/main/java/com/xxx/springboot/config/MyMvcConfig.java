package com.xxx.springboot.config;

import com.xxx.springboot.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/succ").setViewName("success");
        super.addViewControllers(registry);
    }

    //所有的WebMvcConfigurerAdapter组件都会起作用
    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {

            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
                super.addViewControllers(registry);
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
//                super.addInterceptors(registry);
//                registry.addInterceptor(new LoginHandlerInteceptor()).addPathPatterns("/**").excludePathPatterns("/index.html", "/", "/user/login");
            }
        };
        return adapter;
    }
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }


}
