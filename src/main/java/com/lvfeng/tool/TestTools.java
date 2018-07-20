package com.lvfeng.tool;

import com.lvfeng.tool.chars.encrypt.EncryptUtil;
import com.lvfeng.tool.weather.WeatherAPI;

public class TestTools {
	public static void main(String[] args) throws Exception{
		//---------001.天气预报测试------------
//		String res = WeatherAPI.getWeatherWeek("1", WeatherAPI.APP_KEY_WEATHER, WeatherAPI.SIGN_WEATHER, "json");
//		System.out.println("结果集" + res);
//		String res2 = WeatherAPI.getNowWeather("1", WeatherAPI.APP_KEY_WEATHER, WeatherAPI.SIGN_WEATHER, "json");
//		System.out.println("结果集2" + res2);
//		WeatherWeek wea = (WeatherWeek)JSONChange.jsonToObj(new WeatherWeek(), res);
//		System.out.println("是否成功？"+wea.getSuccess()+"结果集举例【城市名称】："+wea.getResult().get(0).getCitynm());
//		System.out.println("---------------------开始反转------------------");
//		String jsonStr = JSONChange.objToJson(wea);
//		System.out.println("反转结果："+jsonStr);
		/* {
		 * "success":"1",
		 * "result":[{
		 * 		"weaid":"1",
		 * 		"days":"2018-07-18",
		 * 		"week":"星期三",
		 * 		"cityno":"beijing",
		 * 		"citynm":"北京",
		 * 		"cityid":"101010100",
		 * 		"temperature":"32℃/25℃",
		 * 		"humidity":"0%/0%",
		 * 		"weather":"多云转小雨",
		 * 		"weather_icon":"http://api.k780.com/upload/weather/d/1.gif",
		 * 		"weather_icon1":"http://api.k780.com/upload/weather/n/7.gif",
		 * 		"wind":"东风",
		 * 		"winp":"<3级",
		 * 		"temp_high":"32",
		 * 		"temp_low":"25",
		 * 		"humi_high":"0",
		 * 		"humi_low":"0",
		 * 		"weatid":"2",
		 * 		"weatid1":"8",
		 * 		"windid":"10",
		 * 		"winpid":"395",
		 * 		"weather_iconid":"1",
		 * 		"weather_iconid1":"7"
		 * 	},{
		 * 		下面雷同，不在举例
		 * }]}
		 */
		//-------------002.加密解密【DES】--------------
		try {
			String str = "被加密字符串";	
			String key = "密钥";	// 自定义密钥，当然这里是举例，接口加密完成
			EncryptUtil des = new EncryptUtil(key, "utf-8");
			System.out.println("加密前的字符：" + str);
			String pass = des.enCode(str);
			System.out.println("加密后的字符：" + pass);
			System.out.println("------开始解密-----");
			String sour = des.deCode(pass);
			System.out.println("解密后：" + sour);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
