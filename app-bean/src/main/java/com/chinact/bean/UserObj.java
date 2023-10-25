package com.chinact.bean;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import com.chinact.config.model.ModelObj;

/**
 * 
 * 用户表
 * 
 * @ClassName: UserObj
 * @Description: TODO
 * @author Gaokui
 * @date 2023-09-18 09:56:40
 */
@TableName("user")
public class UserObj extends ModelObj implements Serializable{

	/**  
	 * @Fields serialVersionUID : TODO
	 * @author Gaokui
	 * @date 2023-09-18 02:01:15 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户编码
	 */
	private String userNo;
	
	/**
	 * 用户名
	 */
	private String userName;
	
	/**
	 * 密码
	 */
	private String userPassWord;
	
	/**
	 * 性别 
	 */
	private String sex;
	
	/**
	 * 年龄
	 */
	private String age;

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassWord() {
		return userPassWord;
	}

	public void setUserPassWord(String userPassWord) {
		this.userPassWord = userPassWord;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserObj [userNo=" + userNo + ", userName=" + userName + ", userPassWord=" + userPassWord + ", sex="
				+ sex + ", age=" + age + "]";
	}
	
	
}
