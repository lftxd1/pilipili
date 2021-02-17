package com.sp.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.FileNotFoundException;

@Configuration
public class UploadConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("配置文件已经生效");
        //关于图片上传后需要重启服务器才能刷新图片
        //这是一种保护机制，为了防止绝对路径被看出来，目录结构暴露
        //解决方法:将虚拟路径/images/
        //        向绝对路径 (D:\\Java学习\\springboot小滴\\springboot项目\\upload\\src\\main\\resources\\static\\images\\)映射

        String path="D:\\JavaWeb\\sp\\src\\main\\resources\\static\\images\\";

        registry.addResourceHandler("/images/**").addResourceLocations("file:"+path);
        path="D:\\JavaWeb\\sp\\src\\main\\resources\\static\\files\\";
        registry.addResourceHandler("/files/**").addResourceLocations("file:"+path);


    }
}