package com.lvfeng.tool.weather.pojo.InsidePojo;
/**
 * @author Administrator
 * 城市列表结果集
 */
public class ResultCityList {
	/*
	 * "weaid": "1",
			"citynm": "北京",
			"cityno": "beijing",
			"cityid": "101010100",
			"area_1": "北京",
			"area_2": "城区",
			"area_3": ""
	 */
	private String citynm;
	private String cityno;
	private String cityid;
	private String area_1;
	private String area_2;
	private String area_3;
	
	
	public String getCitynm() {
		return citynm;
	}
	public void setCitynm(String citynm) {
		this.citynm = citynm;
	}
	public String getCityno() {
		return cityno;
	}
	public void setCityno(String cityno) {
		this.cityno = cityno;
	}
	public String getCityid() {
		return cityid;
	}
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}
	public String getArea_1() {
		return area_1;
	}
	public void setArea_1(String area_1) {
		this.area_1 = area_1;
	}
	public String getArea_2() {
		return area_2;
	}
	public void setArea_2(String area_2) {
		this.area_2 = area_2;
	}
	public String getArea_3() {
		return area_3;
	}
	public void setArea_3(String area_3) {
		this.area_3 = area_3;
	}
}
