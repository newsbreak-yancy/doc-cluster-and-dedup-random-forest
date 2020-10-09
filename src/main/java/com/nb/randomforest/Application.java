package com.nb.randomforest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author yuxi
 * @date 2020/10/9
 */
@SpringBootApplication
@EnableAspectJAutoProxy
@EnableTransactionManagement
@EnableAsync
public class Application extends WebMvcConfigurerAdapter {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
