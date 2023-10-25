package com.chinact.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chinact.bean.UserObj;
import com.chinact.mapper.UserMapper;
import com.chinact.service.UserService;

/**
 * 
 * 用户接口实现
 * 
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @author Gaokui
 * @date 2023-09-18 10:34:57
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserObj> implements UserService {

	@Autowired
	public UserMapper userMapper;

	/**
	 * 
	 * 获取用户信息集合
	 * 
	 * @MethodName: getUserList
	 * @Description: TODO
	 * @author Gaokui
	 * @return
	 * @see com.chinact.service.UserService#getUserList()
	 * @date 2023-10-08 09:34:05`
	 */
	@Override
	public List<UserObj> getUserList() {
		QueryWrapper<UserObj> query = new QueryWrapper<UserObj>();
		return userMapper.selectList(query);
	}

}
