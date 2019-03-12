package com.example.bootDemo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 
 * @author xxz
 *
 */
@Configuration
public class WebConfiguration {
	    @Bean
	    public RemoteIpFilter remoteIpFilter() {
	        return new RemoteIpFilter();
	    }
	    
	   // @Bean
	    public FilterRegistrationBean testFilterRegistration2() {
	        FilterRegistrationBean registration = new FilterRegistrationBean();
	        registration.setFilter(new MyFilter2());
	        registration.addUrlPatterns("/*");
	        registration.addInitParameter("paramName", "paramValue");
	        registration.setName("MyFilter2");
	        registration.setOrder(1);
	        return registration;
	    }
	    
	   // @Bean
	    public FilterRegistrationBean testFilterRegistration() {
	        FilterRegistrationBean registration = new FilterRegistrationBean();
	        registration.setFilter(new MyFilter());
	        registration.addUrlPatterns("/*");
	        registration.addInitParameter("paramName", "paramValue");
	        registration.setName("MyFilter");
	        registration.setOrder(1);
	        return registration;
	    }
	    
	    
	 public class MyFilter implements Filter {
		@Override
		public void destroy() {
			System.out.println("destroy1111111111 ");
		}

		@Override
		public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain filterChain)
				throws IOException, ServletException {
			HttpServletRequest request = (HttpServletRequest) srequest;
			System.out.println("this is MyFilter,url :"+request.getRequestURI());
			filterChain.doFilter(srequest, sresponse);
			System.out.println("this is MyFilter chulai");
		}

		@Override
		public void init(FilterConfig arg0) throws ServletException {
			System.out.println("init1111111111 ");
		}
    }
	 
	 public class MyFilter2 implements Filter {
			@Override
			public void destroy() {
				System.out.println("destroy2222222222222");
			}

			@Override
			public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain filterChain)
					throws IOException, ServletException {
				HttpServletRequest request = (HttpServletRequest) srequest;
				System.out.println("this is MyFilter2,url :"+request.getRequestURI());
				filterChain.doFilter(srequest, sresponse);
				System.out.println("this is MyFilter2 chulai");
			}

			@Override
			public void init(FilterConfig arg0) throws ServletException {
				System.out.println("init2222222222222");
			}
	    }
}
