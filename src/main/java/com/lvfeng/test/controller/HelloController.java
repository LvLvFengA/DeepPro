package com.lvfeng.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lvfeng.test.exception.BusinessException;

//全局控制器
@RestController
public class HelloController {
	/*
	 * 自定义变量，在读取properties文件的时候，使用注解value指定标签名称
	 * 这就是通过注解获取到配置文件自定义属性值
	 */
	@Value("${lvfeng.msg}")
	private String msg;
	
	//请求域，用户直接请求这个目录的时候，使用这个方法
	@RequestMapping("/hello")
	public String index() {
//		return "于某人";
		
//		int no = 1 / 0;		//设置一个异常【测试普通异常】
//		throw new BusinessException("100","自定义异常：用户名错误！");//抛出自定义异常
		
//		return this.msg;	//通过读取配置文件返回这个值
		return "hello/";
	}
}
