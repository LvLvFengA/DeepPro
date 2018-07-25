package com.lvfeng.tool.weather.pojo;

import com.lvfeng.tool.weather.pojo.InsidePojo.ResultNowPM25;
/**
 * @author LvLvFeng
 * PM25指数对象
 */
public class NowPM25 {
	private String success;
	private ResultNowPM25 result;	//这里的名称，要和json返回的相对应
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public ResultNowPM25 getResult() {
		return result;
	}
	public void setResult(ResultNowPM25 result) {
		this.result = result;
	}
}
