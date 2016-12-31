/*package com.niit.chat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//this tells that we have some bean configuration inside the class
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
//<mvc:annotation-driven></mvc:annotation-driven>
@EnableWebMvc
//scan the components for creating the beans - controllers, services and repository
@ComponentScan(basePackages="com.niit")
public class WebAppConfig extends WebMvcConfigurerAdapter{
	//create an instance 
@Bean
public InternalResourceViewResolver viewResolver(){
	InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
	viewResolver.setPrefix("/WEB-INF/views/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
}

@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
{
	configurer.enable();
}

public void addResourceHandlers(ResourceHandlerRegistry registry){
	registry.addResourceHandler("/resources/**").addResourceLocations("/WEB-INF/resources/");
}
}*/