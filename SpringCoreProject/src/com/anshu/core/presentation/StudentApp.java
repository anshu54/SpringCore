package com.anshu.core.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anshu.core.bean.Student;

public class StudentApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student)applicationContext.getBean("student");
		System.out.println(student);
		

	}

}
