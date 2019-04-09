package com.util;

public class State {
   
	/**
	    * 该次请求的结果:0 失败, 1成功
	 */
	private int state;
	
	/**
	    * 请求结果的描述信息
	 */
	private String message;
	
	/**
	   * 返回的结果对象
	 */
	private Object resultObj;
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getResultObj() {
		return resultObj;
	}
	public void setResultObj(Object resultObj) {
		this.resultObj = resultObj;
	}
	
	
}
