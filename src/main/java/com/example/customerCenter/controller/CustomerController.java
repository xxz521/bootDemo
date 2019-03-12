package com.example.customerCenter.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.session.Session;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customerCenter.dao.UserDao;
import com.example.customerCenter.model.User;

/**
 * 
 * @author xxz
 *默认类中的方法都会以json的格式返回
 */
@RestController
public class CustomerController {
	private static Logger logger = Logger.getLogger(CustomerController.class);
	@Value("${com.neo.title}")
	private String title;
	@Autowired UserDao userDao;
	
	@RequestMapping("/hello")
    public String index(HttpServletRequest request,HttpSession session) {
		System.out.println(session);
		System.out.println(session.getId());
		//乱码了 
        return "Hello World 笨蛋";
    }
	
	@RequestMapping("/getUser")
	@Cacheable(value="user-key")
	public User getUser() {
		logger.info("my action start");
		User user=userDao.findByUserName("aa");
    	logger.info(title);
        return user;
	}
	
	@RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
	
}
