package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.CacheControl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

@Order(1)
@Configuration
@EnableWebMvc
class WebMvcConfiguration implements WebMvcConfigurer {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/vendor/**").addResourceLocations("classpath:/static/vendor/", "/static/vendor/")
//                .setCacheControl(CacheControl.maxAge(12, TimeUnit.HOURS).cachePublic());
//        registry.addResourceHandler("/fonts/**").addResourceLocations("classpath:/static/fonts/", "/static/fonts/")
//                .setCacheControl(CacheControl.maxAge(12, TimeUnit.HOURS).cachePublic());
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/", "/static/css/")
                .setCacheControl(CacheControl.maxAge(12, TimeUnit.HOURS).cachePublic());
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/", "/static/js/")
                .setCacheControl(CacheControl.maxAge(12, TimeUnit.HOURS).cachePublic());
        registry.addResourceHandler("/images/**").addResourceLocations("classpath:/static/images/", "static/images/")
                .setCacheControl(CacheControl.maxAge(12, TimeUnit.HOURS).cachePublic());
        registry.addResourceHandler("/img/**").addResourceLocations("classpath:/static/img/", "static/img/")
                .setCacheControl(CacheControl.maxAge(12, TimeUnit.HOURS).cachePublic());
    }

}