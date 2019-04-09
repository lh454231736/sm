package com.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 基础domain类
 * @author LiHuan
 * 1.标注为@MappedSuperclass的类将不是一个完整的实体类，他将不会映射到数据库表，但是他的属性都将映射到其子类的数据库字段中。
 * 2.标注为@MappedSuperclass的类不能再标注@Entity或@Table注解，也无需实现序列化接口。
 */
@MappedSuperclass
public class BaseDomain{
	
	/**
	 * 主鍵id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	/**
	 * 创建日期
	 */
	@Column(name="create_date")
	private Date createDate;
     
	/**
	 * 账户状态
	 * 0--锁定, 1--正常 ,2--废弃
	 */
	@Column(name="status")
	private int status;
    
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getStatus() {
		return status;
	}
    
	/**
	 * 账户状态
	 * 0--锁定, 1--正常 ,2--废弃
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	
}
