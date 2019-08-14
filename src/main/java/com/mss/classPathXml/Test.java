package com.mss.classPathXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mss.view.View;

public class Test {

	public static void main(String[] args) {
	 ApplicationContext ap= new ClassPathXmlApplicationContext("applicationContext.xml");
	    View view=(View)ap.getBean("view");
	    view.searchForBrandedMobiles("Red me");
	}
}
