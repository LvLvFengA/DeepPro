package com.lvfeng.test.exception;
/**
 * 自定义异常示例
 * @author LvFeng
 * 如何使用：
 *
 */
public class BusinessException extends RuntimeException{
	private String code;	//异常代码段
	private String msg;		//抛出的异常信息
	//构造函数
	public BusinessException(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
