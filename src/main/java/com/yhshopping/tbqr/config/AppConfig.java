package com.yhshopping.tbqr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    //跨域
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")
                .allowCredentials(true)
                .maxAge(3600)
                .allowedHeaders("*");
    }

    //图片路径
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("........" + ValueConfig.IMGPATH);
        registry.addResourceHandler("/qrimg/**")
                .addResourceLocations(ValueConfig.IMGPATH);
    }
}