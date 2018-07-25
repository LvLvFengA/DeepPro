package com.lvfeng.tool.weather.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.lvfeng.tool.weather.pojo.InsidePojo.Result;

/**
 * @author Administrator
 * 一周天气对象
 * DOC:https://blog.csdn.net/u010457406/article/details/50921632
 * 	   https://blog.csdn.net/jxchallenger/article/details/79293772
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property ="success")
public class WeatherWeek {
	private String success;	//是否成功
	private List<Result> result;	//结果集数组

	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public List<Result> getResult() {
		return result;
	}
	public void setResult(List<Result> result) {
		this.result = result;
	}
	
	
}
