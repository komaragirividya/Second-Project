package com.niit.chat.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.chat.dao.FriendDao;
import com.niit.chat.model.Friend;

public class FriendTest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
				context.scan("com.niit");
				context.refresh();
				
				
			    FriendDao friendDao= (FriendDao) context.getBean("friendDao");

				Friend friend=(Friend) context.getBean("friend");
				

				
			/*	friend.setFromId("123");
				friend.setStatus('p');
				friend.setToId("student");
			
				/*friendDao.sendFriendRequest("ram", "adi");*/
				/*friendDao.updatePendingRequest('A', "srishti", "adi");*/
				
				System.out.println(friendDao.getAllFriends("ram"));
				

	}

}



