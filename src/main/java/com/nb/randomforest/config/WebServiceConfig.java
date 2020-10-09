package com.nb.randomforest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.http.MediaType;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.DefaultCorsProcessor;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Arrays;
import java.util.Locale;

/**
 * @author yuxi
 * @date 2020/10/9
 */
@Configuration
public class WebServiceConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowedMethods(Arrays.asList(
			"OPTIONS", "HEAD", "GET", "POST", "PUT", "PATCH", "DELETE"));
		config.setAllowedOrigins(Arrays.asList("*"));
		config.setAllowedHeaders(Arrays.asList(
			"Authorization", "Content-Type", "Origin", "X-Auth-Token", "Cookie",
			"If-Match", "If-Modified-Since", "If-None-Match", "If-Unmodified-Since"));
		config.setExposedHeaders(Arrays.asList(
			"ETag", "Link", "Location", "X-Auth-Token", "Cookie",
			"X-RateLimit-Limit", "X-RateLimit-Remaining",
			"X-RateLimit-Reset", "X-DataGator-Entity"));
		config.setMaxAge(3600L);
		config.setAllowCredentials(true);
		source.registerCorsConfiguration("/**", config);
		CorsFilter bean = new CorsFilter(source);
		bean.setCorsProcessor(new DefaultCorsProcessor());
		return bean;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
	}
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        // NOP
//    }
	
	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer config) {
		config.favorPathExtension(false)
			.favorParameter(true)
			.ignoreUnknownPathExtensions(false)
			.defaultContentType(MediaType.APPLICATION_JSON)
			.mediaType("json", MediaType.APPLICATION_JSON);
	}
	
	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver slr = new SessionLocaleResolver();
		slr.setDefaultLocale(Locale.US);
		return slr;
	}
	
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:/messages");
		messageSource.setCacheSeconds(3600);
		return messageSource;
	}
	
}
