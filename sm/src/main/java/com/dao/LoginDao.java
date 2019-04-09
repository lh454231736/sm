package com.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.domain.student.Student;

@Repository
public class LoginDao {
	
	private static Logger LOG = Logger.getLogger(LoginDao.class);
	
	@Autowired
    private SessionFactory sessionFactory;  
    
	public List<Student> login(String userName,String password) {
	    Session session = sessionFactory.getCurrentSession();
	    SQLQuery sqlQuery = session.createSQLQuery("select * from tb_student t where t.s_user_name = '"+userName+"' and t.s_password = '"+password+"'");
	    LOG.info(sqlQuery);
	    List<Student> list = sqlQuery.addEntity(Student.class).list();
	    return list;
	}
}
