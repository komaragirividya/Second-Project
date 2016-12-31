package com.niit.chat.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.chat.dao.FileUploadDao;
import com.niit.chat.model.FileUpload;

public class FileUploadTest {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		FileUploadDao fileUploadDao = (FileUploadDao)context.getBean("fileUploadDao");
		FileUpload fileUpload = (FileUpload)context.getBean("fileUpload");
		
		/*fileUpload.setUsername("arun");
		fileUpload.setFileName("abc");
		
		String s = "hello";
		byte b[] = s.getBytes();
		
		fileUpload.setData(b);
		
		fileUploadDao.save(fileUpload);*/
		
		//System.out.println(fileUploadDao.getFile("arun").getFileName());
		
	}

}
