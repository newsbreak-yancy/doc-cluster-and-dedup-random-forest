package com.nb.randomforest.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
import java.util.Arrays;

/**
 * @author yuxi
 * @date 2020/10/9
 */
@Aspect
@Component
public class WebRequestAspect {
	@Autowired
	private ObjectMapper objectMapper;
	
	protected Log logger = LogFactory.getLog(getClass());
	
	private ThreadLocal<Long> startTime = new ThreadLocal<Long>();
	
	@Pointcut("execution(* com.nb.randomforest.endpoint..*.*(..))")
	public void webLog(){
	}
	
	@Before("webLog()")
	public void doBefore(JoinPoint joinPoint) throws Throwable {
		// 接收到请求，记录请求内容
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		startTime.set(System.currentTimeMillis());
		
		ObjectNode object = objectMapper.createObjectNode();
		object.put("URL", request.getRequestURL().toString());
		object.put("METHOD", request.getMethod());
		object.put("PARAMS", Arrays.toString(joinPoint.getArgs()));
		object.put("IP", request.getRemoteAddr());
		logger.info(object.toString());
	}
	
	@AfterReturning(returning = "ret", pointcut = "webLog()")
	public void doAfterReturning(Object ret) throws Throwable {
		// 处理完请求，返回内容
		ObjectNode object = objectMapper.createObjectNode();
		object.putPOJO("RESPONSE", ret);
		object.put("SPEND_TIME", System.currentTimeMillis() - startTime.get());
		logger.info(object.toString());
	}
}
