package com.lvfeng.tool.weather.pojo;

import com.lvfeng.tool.weather.pojo.InsidePojo.ResultCityList;

/**
 * @author Administrator
 * 获取城市列表
 */
public class CityList {
	private String success;
	private ResultCityList result;
	
	
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public ResultCityList getResult() {
		return result;
	}
	public void setResult(ResultCityList result) {
		this.result = result;
	}
}
