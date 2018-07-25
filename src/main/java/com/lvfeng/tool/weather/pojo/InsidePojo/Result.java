package com.lvfeng.tool.weather.pojo.InsidePojo;
/**
 * @author LvLvFeng
 * Weather子类，天气结果的返回值
 */
public class Result {
	private String weaid;	//本站【调用接口的这个站点】的城市ID编号
	private String days;	//日期
	private String week;	//周几
	private String cityno;	//城市编码
	private String citynm;	//城市名称
	private String cityid;	//城市气象ID【标准】
	private String temperature;	//气温
	private String humidity;	//湿度【暂未使用】
	private String weather;		//天气
	private String weather_icon;	//白天的气象图标
	private String weather_icon1;	//夜间的气象图标
	private String wind;			//风向
	private String winp;			//风力
	private String temp_high;		//最高气温
	private String temp_low;		//最低气温
	private String humi_high;		//温度栏位【弃用】
	private String humi_low;		//湿度栏位【弃用】
	private String weatid;			//白天天气ID，可对照weather.wtype接口中weaid
	private String weatid1;			//夜间天气ID，可对照weather.wtype接口中weaid
	private String windid;			//风向ID(暂无对照表)
	private String winpid;			//风力ID(暂无对照表)
	private String weather_iconid;	//气象图标编号(白天),对应weather_icon 1.gif
	private String weather_iconid1;	//气象图标编号(夜间),对应weather_icon1 0.gif
	public String getWeaid() {
		return weaid;
	}
	public void setWeaid(String weaid) {
		this.weaid = weaid;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getCityno() {
		return cityno;
	}
	public void setCityno(String cityno) {
		this.cityno = cityno;
	}
	public String getCitynm() {
		return citynm;
	}
	public void setCitynm(String citynm) {
		this.citynm = citynm;
	}
	public String getCityid() {
		return cityid;
	}
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getWeather_icon() {
		return weather_icon;
	}
	public void setWeather_icon(String weather_icon) {
		this.weather_icon = weather_icon;
	}
	public String getWeather_icon1() {
		return weather_icon1;
	}
	public void setWeather_icon1(String weather_icon1) {
		this.weather_icon1 = weather_icon1;
	}
	public String getWind() {
		return wind;
	}
	public void setWind(String wind) {
		this.wind = wind;
	}
	public String getWinp() {
		return winp;
	}
	public void setWinp(String winp) {
		this.winp = winp;
	}
	public String getTemp_high() {
		return temp_high;
	}
	public void setTemp_high(String temp_high) {
		this.temp_high = temp_high;
	}
	public String getTemp_low() {
		return temp_low;
	}
	public void setTemp_low(String temp_low) {
		this.temp_low = temp_low;
	}
	public String getHumi_high() {
		return humi_high;
	}
	public void setHumi_high(String humi_high) {
		this.humi_high = humi_high;
	}
	public String getHumi_low() {
		return humi_low;
	}
	public void setHumi_low(String humi_low) {
		this.humi_low = humi_low;
	}
	public String getWeatid() {
		return weatid;
	}
	public void setWeatid(String weatid) {
		this.weatid = weatid;
	}
	public String getWeatid1() {
		return weatid1;
	}
	public void setWeatid1(String weatid1) {
		this.weatid1 = weatid1;
	}
	public String getWindid() {
		return windid;
	}
	public void setWindid(String windid) {
		this.windid = windid;
	}
	public String getWinpid() {
		return winpid;
	}
	public void setWinpid(String winpid) {
		this.winpid = winpid;
	}
	public String getWeather_iconid() {
		return weather_iconid;
	}
	public void setWeather_iconid(String weather_iconid) {
		this.weather_iconid = weather_iconid;
	}
	public String getWeather_iconid1() {
		return weather_iconid1;
	}
	public void setWeather_iconid1(String weather_iconid1) {
		this.weather_iconid1 = weather_iconid1;
	}
	
}
