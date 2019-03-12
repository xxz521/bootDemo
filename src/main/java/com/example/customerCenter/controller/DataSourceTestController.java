package com.example.customerCenter.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.customerCenter.dao.UserDao;
import com.example.customerCenter.model.User;
import com.example.goodsCenter.dao.HospitalDao;
import com.example.goodsCenter.model.Hospital;

@Controller
@RequestMapping(value = "/bootDemo/test")
public class DataSourceTestController {
	private static Logger logger = Logger.getLogger(DataSourceTestController.class);
	@Autowired private UserDao userDao;
	@Autowired private HospitalDao hospitalDao;
	
	@RequestMapping(value = "test")
	@ResponseBody
	public String testData(HttpServletRequest request,HttpSession session) {
		System.out.println(session);
		System.out.println(session.getId());
		User user = userDao.findByUserName("aa4");
		Hospital hospital = hospitalDao.findByHospitalName("北京人民大学医院");
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("数据源1：", user.toString());
		map.put("数据源2：", hospital.toString());
		logger.info(map.toString());
		return "";
	}
}
