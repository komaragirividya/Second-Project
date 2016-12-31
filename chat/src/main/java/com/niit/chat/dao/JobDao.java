package com.niit.chat.dao;


import java.util.List;

import com.niit.chat.model.Job;



public interface JobDao 
{
	public void addJob(Job job);
	void postJob(Job job);
	List<Job> getAllJobs();
}

