package com.niit.chat.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.chat.dao.UserDao;
import com.niit.chat.model.User;



public class UsersTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
				context.scan("com.niit");
				context.refresh();
				
				
			    UserDao userDao= (UserDao) context.getBean("userDao");

				User user=(User) context.getBean("user");
				
//				users.setId("pavan123");
//				users.setName("pavan");
//				users.setEmail("pavan@gmail.com");
//				users.setDob("12/12/2012");
//				users.setPhoneNo("595468521");
//				users.setPassword("123");
//				users.setIsOnline('N');
//				users.setGender("male");
//				users.setRole("alumini");
//				users.setStatus('N');
//				users.setAddress("MVM");
//				
//				usersDAO.addUser(users);
				
				user.setUsername("pppp");
				user.setPassword("123");
				user.setEmail("ppp@gmail.com");
				user.setRole("student");
				user.setStatus(false);
				user.setOnline(false);
				
				userDao.addUser(user);

	}

}
