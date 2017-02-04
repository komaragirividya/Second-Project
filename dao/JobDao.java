package com.niit.chat.dao;


import java.util.List;

import com.niit.chat.model.Job;
import com.niit.chat.model.JobApp;



public interface JobDao 
{
	public void addJob(Job job);
	void postJob(Job job);
	List<Job> getAllJobs();
	
	public void applyForJob(JobApp jobApp);
	public void save(JobApp jobApp);
	public void getJobApp(int jobID);
	
}

