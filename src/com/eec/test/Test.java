package com.eec.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eec.pojo.Bean2;
import com.eec.pojo.Bean3;
import com.eec.pojo.User;

public class Test {
	public static void main(String[] args) {
		/*User user=new User();
		user.getWords();*/
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//1、利用无参构造来创建对象
		/*User user=(User)ac.getBean("user");
		user.getWords();*/
		
		//2、利用静态方法来创建对象
		/*Bean2 bean=(Bean2)ac.getBean("bean2");
		bean.add();*/
		
		//3、利用非静态方法(实例方法)来创建对象
		Bean3 bean3=(Bean3)ac.getBean("bean");
		bean3.add();
	}
}
