package com.example.bootDemo.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NeoProperties {
	public static String title;
	@Value("${com.neo.description}")
	private String description;
	
	public String getTitle() {
		return title;
	}
	@Value("${com.neo.title}")
	public void setTitle(String title) {
		NeoProperties.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
