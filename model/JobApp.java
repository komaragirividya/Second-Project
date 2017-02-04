package com.niit.chat.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Table(name="JobApp")
@Entity 
public class JobApp 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String userID;
	private int jobId;
    private Date PostedOn;
    private String remarks;
    private char status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public Date getPostedOn() {
		return PostedOn;
	}
	public void setPostedOn(Date postedOn) {
		PostedOn = postedOn;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
    
    

	
}
