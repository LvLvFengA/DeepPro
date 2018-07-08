package com.lvfeng.test.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局捕获异常类，通过扫描@RequestMapping注解，类中产生的异常就会通过这种方式进行处理
 * @author 绿峰
 * 注意：使用json转换时需要添加依赖:jackson，否则会抛出map错误
 */
@ControllerAdvice	//定义普通异常处理类
public class MyControllerAdvice {
	//001.全局异常设置
	@ResponseBody	//将一个controller方法返回的对象转换为json或者xml形式，写入response
	@ExceptionHandler(value=Exception.class)
	public Map<String,Object> errorHandler(Exception ex){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", -1);
		map.put("msg", ex.getMessage());	//获取异常信息
		return map;
	}
	
	//002.自定义异常
	@ResponseBody
	@ExceptionHandler(value=BusinessException.class)
	public Map<String,Object> errorHandler(BusinessException ex){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", ex.getCode());		//获取异常代码段
		map.put("msg", ex.getMsg());		//获取自定义异常信息
		return map;
	}
}
