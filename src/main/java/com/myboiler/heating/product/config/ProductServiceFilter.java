package com.myboiler.heating.product.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductServiceFilter implements Filter{
	@Override
	public void destroy()
	{
		
	}
	
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
	{
	
		HttpServletResponse currentResponse = (HttpServletResponse) servletResponse;
		currentResponse.setHeader("Access-Control-Allow-Origin", "*");
		currentResponse.setHeader("Access-Control-Allow-Credentials", "true");
		currentResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
		currentResponse.setHeader("Access-Control-Max-Age", "3600");
		currentResponse.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, X-AUTH-TOKEN");
		
		filterChain.doFilter(servletRequest, servletResponse);
		
	}
	@Override
	public void init(FilterConfig arg0) throws ServletException
	{
		
	}
}
