package com.niit.chat.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.chat.dao.FileUploadDao;
import com.niit.chat.model.FileUpload;
import com.niit.chat.model.User;

/** Handles requests for the file upload page. */
@RestController
public class FileUploadController 
{
	@Autowired
	private FileUploadDao fileUploadDao;

	
    @RequestMapping(value = "/doUpload", method = RequestMethod.POST)
    public String handleFileUpload(HttpServletRequest request,HttpSession session,@RequestParam("uploadFile") CommonsMultipartFile uploadFile) throws Exception 
    {
         User user=(User)session.getAttribute("user");
         if(user==null)
        	 throw new RuntimeException("Not logged in");
         System.out.println("USER is " + user.getUsername());
         
         if (uploadFile != null ) {
             CommonsMultipartFile aFile = uploadFile;
            
                System.out.println("Saving file: " + aFile.getOriginalFilename());
                
                FileUpload fileUpload = new FileUpload();
                fileUpload.setFileName(aFile.getOriginalFilename());
                fileUpload.setData(aFile.getBytes());//image 
                fileUpload.setUsername(user.getUsername());//login details
                fileUploadDao.save(fileUpload);
                //select * from proj2_profie_pics where username='smith'
                FileUpload getFileUpload=fileUploadDao.getFile(user.getUsername());
            	String name=getFileUpload.getFileName();
            	System.out.println(getFileUpload.getData());
            	byte[] imagefiles=getFileUpload.getData();  //image
            	try{
            		//change the path according to your workspace and the name of your project
            		String path="E:/project/project2/frontEnd/WebContent/imagee/"+user.getUsername();
            		File file=new File(path);
            		//file.mkdirs();
            		FileOutputStream fos = new FileOutputStream(file);
            		fos.write(imagefiles);// write the array of bytes in username file.
            		fos.close();
            		}catch(Exception e){
            		e.printStackTrace();
            		}
             }
                
 
        return "<h1>Successfully uploaded the Profile Picture</h1>";
    }
}


