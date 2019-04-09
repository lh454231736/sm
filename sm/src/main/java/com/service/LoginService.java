package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.LoginDao;
import com.domain.student.Student;

@Service
@Transactional
public class LoginService {
    
	@Autowired
	private LoginDao loginDao;
	
	public List<Student> login(String userName,String password){
		return loginDao.login(userName, password);
	}
}
