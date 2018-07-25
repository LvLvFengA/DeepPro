package com.lvfeng.tool.weather.pojo;

import java.util.List;

import com.lvfeng.tool.weather.pojo.InsidePojo.ResultNowWeather;
/**
 * @author LvFeng
 * 当前天气
 */
public class NowWeather {
	private String success;	//是否成功
	private ResultNowWeather result;	//结果集数组
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	//注意：按照结果集命名变量，所以这个对象的setget需要更改一下，如下
	public ResultNowWeather getResult() {
		return result;
	}
	public void setResult(ResultNowWeather result) {
		this.result = result;
	}
	
}
