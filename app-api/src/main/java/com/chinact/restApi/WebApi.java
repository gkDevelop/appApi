package com.chinact.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chinact.bean.UserObj;
import com.chinact.config.result.HttpResult;
import com.chinact.service.UserService;

/**
 * 
 * 外部接口例子
 * 
 * @ClassName: WebApi
 * @Description: TODO
 * @author Gaokui
 * @date 2023-09-07 04:07:37
 */
@RestController
@RequestMapping("/user")
public class WebApi {

	@Autowired
	private UserService userService;

	/**
	 * 
	 * 获取用户集合
	 * 
	 * @MethodName: getUserList
	 * @Description: TODO
	 * @author Gaokui
	 * @return HttpResult<List<UserObj>>
	 * @date 2023-10-09 08:41:39
	 */
	@RequestMapping("/getUserList")
	public HttpResult<List<UserObj>> getUserList() {
		List<UserObj> list = userService.getUserList();
		return HttpResult.success(list);
	}

}
