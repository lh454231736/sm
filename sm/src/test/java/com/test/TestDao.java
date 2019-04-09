package com.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.domain.student.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class TestDao {
   @Autowired	
   private HibernateTemplate ht;
   
 /**
      *测试 学生的插入功能
 */
@Test
   public void test1() {
	   Student stu = new Student();
	   stu.setAge(23);
	   stu.setCreateDate(new Date());
	   stu.setDescript("");
	   stu.setGender("男");
	   stu.setGrade("无");
	   stu.setJoinDate(new Date());
	   stu.setName("张三");
	   stu.setUserName("scott");
	   stu.setPassword("123456");
	   stu.setStatus(1);
	   stu.setTel("无");
	   ht.save(stu);
	   
   }
}
