package com.nb.randomforest.config;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.context.request.RequestAttributes.SCOPE_REQUEST;

/**
 * @author yuxi
 * @date 2020/10/09
 */
@ControllerAdvice
public class ErrorHandlerConfig {
	
	@ExceptionHandler(value = {RuntimeException.class, Exception.class})
	public ModelAndView defaultExceptionHandler(Exception ex, WebRequest request) {
		request.setAttribute("trace", true, SCOPE_REQUEST);
		return new ModelAndView("/error");
	}
	
	@Bean
	public EmbeddedServletContainerCustomizer exceptionHandling() {
		return new EmbeddedServletContainerCustomizer() {
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				container.addErrorPages(new ErrorPage("/error"));
			}
		};
	}
	
}
