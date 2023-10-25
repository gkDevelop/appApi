package com.chinact.config.result;

/**
 * 
 * 接口返回封装
 * 
 * @ClassName: HttpResult
 * @Description: TODO
 * @author Gaokui
 * @date 2023-10-07 10:37:00
 */
public class HttpResult<T> {

	private int code;

	private String msg;

	private T data;

	private HttpResult(T data) {
		this.code = 0;
		this.msg = "success";
		this.data = data;
	}

	private HttpResult(CodeMsg codeMsg) {
		if (codeMsg == null) {
			return;
		}
		this.code = codeMsg.getCode();
		this.msg = codeMsg.getMsg();
	}

	/**
	 * 成功时
	 * 
	 * @param <T>
	 * @return
	 */
	public static <T> HttpResult<T> success(T data) {
		return new HttpResult<T>(data);
	}

	/**
	 * 失败
	 * 
	 * @param <T>
	 * @return
	 */
	public static <T> HttpResult<T> fail(CodeMsg mg) {
		return new HttpResult<T>(mg);
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public T getData() {
		return data;
	}
}