package com.niit.chat.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.chat.dao.JobDao;
import com.niit.chat.model.Job;
import com.niit.chat.model.JobApp;

@EnableTransactionManagement
@Transactional
@Repository("jobDao")
public class JobDaoImpl implements JobDao
{
	@Autowired
	private SessionFactory sessionFactory;
	public JobDaoImpl(SessionFactory sessionFactory) 
	{
		this.sessionFactory = sessionFactory;
	}



	@Transactional
	   public void addJob(Job job)
	   {
		  System.out.println("Entering to addUser.....");
		  sessionFactory.getCurrentSession().saveOrUpdate(job);
	   }
	
	
		
		@Override
		public void postJob(Job job) {
			Session session=sessionFactory.getCurrentSession();
			session.save(job);
			/*session.flush();
			session.close();*/

		}

		@Override
		public List<Job> getAllJobs() {
			Session session=sessionFactory.openSession();
			Query query=session.createQuery("from Job");
			List<Job> jobs=query.list();
			session.close();
			return jobs;
		}



		@Transactional
		@Override
		public void applyForJob(JobApp jobApp) 
		{
			sessionFactory.getCurrentSession().saveOrUpdate(jobApp);
			
		}



		@Override
		public void save(JobApp jobApp) 
		{
			sessionFactory.getCurrentSession().save(jobApp);
			
		}



		@Override
		public void getJobApp(int jobID) {
			// TODO Auto-generated method stub
			
		}
		
}
