package com.chinact.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chinact.bean.UserObj;

/**
 * 
 * 用户接口
 * 
 * @ClassName: UserService
 * @Description: TODO
 * @author Gaokui
 * @date 2023-09-18 10:35:13
 */
public interface UserService extends IService<UserObj> {

	/**
	 * 
	 * 获取用户信息集合
	 *
	 * @MethodName: getUser
	 * @Description: TODO
	 * @author Gaokui
	 * @return UserObj
	 * @date 2023-09-18 10:35:46
	 */
	public List<UserObj> getUserList();
}
