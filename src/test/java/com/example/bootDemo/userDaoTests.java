package com.example.bootDemo;

import java.text.DateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bootDemo.utils.NeoProperties;
import com.example.customerCenter.dao.UserDao;
import com.example.customerCenter.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class userDaoTests{
	@Autowired
	private UserDao userDao;
	@Autowired private NeoProperties neoProperties;
	
	//@Test
	public void test() throws Exception {
		Date date = new Date();
		System.out.println(neoProperties.getTitle());
		System.out.println(NeoProperties.title);
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);        
		String formattedDate = dateFormat.format(date);
		System.out.println(formattedDate);
		userDao.save(new User("aa", "aa@126.com", "aa7", "aa123456",formattedDate));
		userDao.save(new User("bb", "bb@126.com", "bb8", "bb123456",formattedDate));
		userDao.save(new User("cc", "cc@126.com", "cc9", "cc123456",formattedDate));
		userDao.save(new User("cc", "cc@126.com", "cc0", "cc123456",formattedDate));
		User user = userDao.findByUserName("aa1");
		System.out.println(user.getNickName());
	}
	
	@Test
	public void testJpa() throws Exception {
		int delete = userDao.modifyByUserName("nick7","aa7");
		System.out.println(delete);
	}
}
