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

@EnableTransactionManagement
@Transactional
@Repository("jobDao")
public class JobDaoImpl implements JobDao
{
	
	@Transactional
	   public void addJob(Job job)
	   {
		  System.out.println("Entering to addUser.....");
		  sessionFactory.getCurrentSession().saveOrUpdate(job);
	   }
	
	@Autowired
	private SessionFactory sessionFactory;
		
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
}
