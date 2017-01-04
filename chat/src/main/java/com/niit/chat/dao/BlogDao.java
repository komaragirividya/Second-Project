package com.niit.chat.dao;


import java.util.List;

import com.niit.chat.model.BlogComment;
import com.niit.chat.model.BlogPost;
import com.niit.chat.model.User;


public interface BlogDao 
{
	List<BlogPost> getBlogPosts();
	BlogPost getBlogPost(int id);
	BlogPost addBlogPost(User user,BlogPost blogPost);
	List<BlogComment> getBlogComments(int blogId);
	BlogPost addBlogPostComment(User user,BlogComment blogComment);
}
