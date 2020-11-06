package com.nb.randomforest.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yuxi
 * @date 2020/10/9
 */
@Aspect
@Component
@Slf4j
public class WebRequestAspect {
	@Autowired
	private ObjectMapper objectMapper;
	
	private ThreadLocal<Long> startTime = new ThreadLocal<Long>();
	
	public static String objectToJsonQuietly(ObjectMapper objectMapper, Object object) {
		try {
			return objectMapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			log.error("Failed to read from object", object);
			return null;
		}
	}
	
	@Pointcut("execution(* com.nb.randomforest.endpoint..*.*(..))")
	public void webLog(){
	}
	
	@Before("webLog()")
	public void doBefore(JoinPoint joinPoint) throws Throwable {
		// 接收到请求，记录请求内容
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		startTime.set(System.currentTimeMillis());
		
		Object[] args = joinPoint.getArgs();
		String body = "";
		if (args.length > 1) {
			body = objectToJsonQuietly(objectMapper, joinPoint.getArgs()[0]);
		}
		
		log.info("ACCESS Log URI: {} METHOD: {} FROM: {} BODY: {}", request.getRequestURL(), request.getMethod(), request.getRemoteAddr(), body);
	}
	
	@AfterReturning(returning = "ret", pointcut = "webLog()")
	public void doAfterReturning(Object ret) throws Throwable {
		// 处理完请求，返回内容
		ObjectNode object = objectMapper.createObjectNode();
		object.putPOJO("RESPONSE", ret);
		object.put("SPEND_TIME", System.currentTimeMillis() - startTime.get());
		log.info(object.toString());
	}
}
