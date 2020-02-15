package com.wrp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.util.concurrent.ListenableFutureCallbackRegistry;

import com.wrp.lsitener.SecondListener;

@SpringBootApplication

public class App2 {
	public static void main(String[] args) {
         SpringApplication.run(App2.class, args);
         
	}
	@Bean
	public ServletListenerRegistrationBean<SecondListener> getListenerRegistrationBean(){
		ServletListenerRegistrationBean<SecondListener> bean = new ServletListenerRegistrationBean<>(new SecondListener());
		return bean;
	}
}
