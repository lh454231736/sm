package com.domain.student;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.domain.BaseDomain;

@Entity
@Table(name="tb_student")
public class Student extends BaseDomain implements java.io.Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户登录名
	 */
	@Column(name="s_user_name")
	private String userName;
	
	 /**
	 * 用户密码
	 */
	@Column(name="s_password")
	private String password;
	
	
	 /**
	 * 用户实际名
	 */
	@Column(name="s_name")
	private String name;
	 
	/**
	 *用户性别 
	 */
	@Column(name="s_gender")
	private String gender;
	
	
	 /**
	 * 用户年龄
	 */
	@Column(name="s_age")
	private Integer age;
	
	 /**
	 * 用户班级
	 */
	
	@Column(name="s_grade")
	private String grade;
	
	
	 /**
	 * 用户电话
	 */
	@Column(name="s_tel")
	private String tel;
	
	
	 /**
	 * 用户个人介绍
	 */
	@Column(name="s_descript")
	private String descript;

	
    /**
     * 用户入学时间
     */
	@Column(name="s_join_date")
    private Date joinDate;
	
	
	public String getUserName() {
		return userName;
	}


	/**
	    * 设置学生登录账号
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	/**
	    * 设置学生真实姓名
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getDescript() {
		return descript;
	}


	public void setDescript(String descript) {
		this.descript = descript;
	}


	public Date getJoinDate() {
		return joinDate;
	}


	/**
	    * 设置入学时间
	 * @param joinDate
	 */
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	
}
