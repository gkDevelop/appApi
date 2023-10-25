package com.chinact.config.result;

/**
 * 
 * 返回异常定义
 * 
 * @ClassName: CodeMsg
 * @Description: TODO
 * @author Gaokui
 * @date 2023-10-07 10:32:48
 */
public class CodeMsg {

	private int code;
	private String msg;

	// 通用的异常信息 1000
	public static CodeMsg SUCCESS = new CodeMsg(0, "success");

	public static CodeMsg TY_SERVER_ERROR = new CodeMsg(10000, "服务端异常");
	public static CodeMsg TY_PASSWORD_EMPTY = new CodeMsg(10001, "密码不能为空");
	public static CodeMsg TY_MOBILE_EMPTY = new CodeMsg(10002, "账号不能为空");
	public static CodeMsg TY_NO_USER = new CodeMsg(10003, "用户不存在");
	public static CodeMsg TY_PASSWORD_ERROR = new CodeMsg(10004, "密码错误");

	// 其他信息依次排列...20000 30000....

	private CodeMsg(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	// 注意需要重写toString 方法,不然到前端页面是一个对象的地址....
	@Override
	public String toString() {
		return "CodeMsg{" + "code=" + code + ", msg='" + msg + '\'' + '}';
	}

}
