package com.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.student.Student;
import com.domain.student.dto.StudentDto;
import com.service.LoginService;
import com.util.State;

/**
     * 登录操作类
 * @author LiHuan
 *
 */
@Controller
public class LoginController {
    
//	@Autowired
//	private HibernateTemplate ht;
//	
//	@Autowired
//	private SessionFactory sessionFactory;
	
	@Autowired
	private LoginService loginService;
	
	private static Logger LOG = Logger.getLogger(LoginController.class);
	
	@RequestMapping(value="/login")
	public String loginIndex() {
	  return "index";	
	}
	
	@RequestMapping(value="/loginController")
	public @ResponseBody State login(@RequestParam("user_name")String userName,@RequestParam("user_password")String password) {
	   
	    List<Student> list = loginService.login(userName, password);
	    State state = new State();
	    state.setState(-1);
	    if(list.size() != 0) {
	    	state.setState(1);
	    	StudentDto stuDto = new StudentDto();
	    	stuDto.setUserName(userName);
	    	state.setMessage("登录成功!");
	    	state.setResultObj(stuDto);	    	
	    }else {
	    	state.setMessage("登录失败!账号或密码错误!!!");
	    }
		return state;	
	}
}
