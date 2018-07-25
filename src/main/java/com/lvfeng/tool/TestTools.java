package com.lvfeng.tool;

import com.lvfeng.tool.chars.encrypt.EncryptUtil;
import com.lvfeng.tool.weather.WeatherAPI;

public class TestTools {
	public static void main(String[] args) throws Exception{
		String myKey = "love10240wsw";		//秘钥
		EncryptUtil des = new EncryptUtil(myKey, "utf-8");//解密接口代码
		//---------001.天气预报测试------------
//		String res = WeatherAPI.getWeatherWeek("1", des.deCode(WeatherAPI.APP_KEY_WEATHER), des.deCode(WeatherAPI.SIGN_WEATHER), "json");
//		System.out.println("一周天气：" + res);
		
//		String res2 = WeatherAPI.getNowWeather("1", des.deCode(WeatherAPI.APP_KEY_WEATHER), des.deCode(WeatherAPI.SIGN_WEATHER), "json");
//		System.out.println("当前天气：" + res2);
		
		String res3 = WeatherAPI.getCityList(des.deCode(WeatherAPI.APP_KEY_WEATHER), des.deCode(WeatherAPI.SIGN_WEATHER), "json");
		System.out.println("PM25指数：" + res3);
//		NowPM25 wea = (NowPM25)JSONChange.jsonToObj(new NowPM25(), res3);	//具体对象接收结果集
//		System.out.println("是否成功"+wea.getSuccess()+"结果集"+wea.getResult().getCitynm());
//		System.out.println("---------------------对象转json------------------");
//		String jsonStr = JSONChange.objToJson(wea);
//		System.out.println("反转结果："+jsonStr);
		/* 
		 * 
		 */
		//-------------002.加密解密【DES】--------------
//		try {
//			String str = "被加密字符串";	
//			String key = "密钥";	// 自定义密钥，当然这里是举例，接口加密完成
//			EncryptUtil des = new EncryptUtil(key, "utf-8");
//			System.out.println("加密前的字符：" + str);
//			String pass = des.enCode(str);
//			System.out.println("加密后的字符：" + pass);
//			System.out.println("------开始解密-----");
//			String sour = des.deCode(pass);
//			System.out.println("解密后：" + sour);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
	}
}
