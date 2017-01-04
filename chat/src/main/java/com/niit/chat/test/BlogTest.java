package com.niit.chat.test;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.chat.dao.BlogDao;

import com.niit.chat.model.BlogPost;
import com.niit.chat.model.User;

public class BlogTest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
				context.scan("com.niit");
				context.refresh();
				
				
				
				 BlogDao blogDao= (BlogDao) context.getBean("blogDao");

					BlogPost blogPost=(BlogPost) context.getBean("blogPost");
					User user=new User();
					user.setId(9);
					blogPost.setBody("good");
					blogPost.setCreatedOn(new Date(04/01/2017));
				    blogPost.setTitle("commenttest");
				    
				    
				    blogDao.addBlogPost(user, blogPost);
					
	}
	
}

