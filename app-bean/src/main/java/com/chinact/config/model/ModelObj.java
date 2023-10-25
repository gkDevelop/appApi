package com.chinact.config.model;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;

/**
 * 
 * 基础类
 * 
 * @ClassName: ModelObj
 * @Description: TODO
 * @author Gaokui
 * @date 2023-09-18 09:30:45
 */
public class ModelObj {

	/**
	 * 唯一主键
	 */
	@TableId
	private String Id;
	
	/**
	 * 创建人
	 */
	private String createId;
	
	/**
	 * 创建时间
	 */
	private Date createDate;
	
	/**
	 * 修改人
	 */
	private String updateId;
	
	/**
	 * 修改时间
	 */
	private Date updateDate;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateId() {
		return updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	
}
