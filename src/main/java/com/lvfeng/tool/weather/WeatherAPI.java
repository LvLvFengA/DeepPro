package com.lvfeng.tool.weather;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

/**
 * @author LvFeng	^^^^^^国家气象局授权第三方接口^^^^^^
 * 来源：https://www.nowapi.com/		接口网
 * 文档：https://www.nowapi.com/api/weather.future
 * 接口服务器【请求头】：https://sapi.k780.com   http://api.k780.com
 * AppKey：35230
 * sign：75674fa122826e731718888eb7788098
 * 每三个月一更新，需要定期更新
 * 过期时间：2018_10_19
 */
public class WeatherAPI {
	/*
	 * 00a.天气预报接口
	 */
	public static final String APP_KEY_WEATHER = "35230";	//KEY
	public static final String SIGN_WEATHER = "75674fa122826e731718888eb7788098";	//SIGN
	/*
	 * 001.获取一周的天气
	 * @param 请求城市气象编码，请求APPKey，SignKey，返回数据格式
	 * @return JSON
	 * DOC:https://www.nowapi.com/api/weather.future
	 * FORMAT:http://api.k780.com/?app=weather.future&weaid=1&appkey=APPKEY&sign=SIGN&format=json
	 * 		哇喔，你就是我的好天气！三克油~》》》
	 */
	public static String getWeatherWeek(String cityNumber,String ak,String sg,String returnFormat) throws Exception{
		String str = "http://api.k780.com/?app=weather.future&weaid="+cityNumber+"&appkey="+ak+"&sign="+sg+"&format="+returnFormat;
		URL url = new URL(str);	//请求URL
		InputStream ins = url.openStream();	//打开输入流
		ByteArrayOutputStream out=new ByteArrayOutputStream();
		try {
            byte buf[] = new byte[1024];
            int read = 0;
            while ((read = ins.read(buf)) > 0) {
                out.write(buf, 0, read);
            }
        } finally {
            if (ins != null) {
                ins.close();
            }
        }
        byte b[] = out.toByteArray( );
		return new String(b,"utf-8");	//转码
	}
	/*
	 * 002.获取现在天气
	 * @param 请求城市气象编码，请求APPKey，SignKey，返回数据格式
	 * @return JSON
	 * DOC:https://www.nowapi.com/api/weather.today
	 * FORMAT:http://api.k780.com/?app=weather.today&weaid=1&appkey=APPKEY&sign=SIGN&format=json
	 */
	public static String getNowWeather(String cityNumber,String ak,String sg,String returnFormat) throws Exception{
		String str = "http://api.k780.com/?app=weather.today&weaid="+cityNumber+"&appkey="+ak+"&sign="+sg+"&format="+returnFormat;
		URL u = new URL(str);
		InputStream in=u.openStream();
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        try {
            byte buf[] = new byte[1024];
            int read = 0;
            while ((read = in.read(buf)) > 0) {
                out.write(buf, 0, read);
            }
        }  finally {
            if (in != null) {
                in.close();
            }
        }
        byte b[] = out.toByteArray( );
		return new String(b,"utf-8");
	}
	/*
	 * 003.历史天气  2015-07-07至今
	 * @param 请求城市气象编码，查询的日期 例如：2015-07-20，请求APPKey，SignKey，返回数据格式
	 * @return JSON
	 * DOC:https://www.nowapi.com/api/weather.history
	 * FORMAT:http://api.k780.com/?app=weather.history&weaid=城市编号(1)&date=查询的日期(2015-07-20)&appkey=APPKEY&sign=SIGN&format=json
	 */
	public static String getHistoryWeather(String cityNumber,String selectDate,String ak,String sg,String returnFormat) throws Exception{
		String str = "http://api.k780.com/?app=weather.history&weaid="+cityNumber+"&date="+selectDate+"&appkey="+ak+"&sign="+sg+"&format="+returnFormat;
		URL u = new URL(str);
		InputStream in = u.openStream();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            byte buf[] = new byte[1024];
            int read = 0;
            while ((read = in.read(buf)) > 0) {
                out.write(buf, 0, read);
            }
        }  finally {
            if (in != null) {
                in.close();
            }
        }
        byte b[] = out.toByteArray( );
		return new String(b,"utf-8");
	}
	/*
	 * 004.获取PM2.5污染指数
	 * @param 请求城市气象编码，请求APPKey，SignKey，返回数据格式
	 * @return JSON
	 * DOC：https://www.nowapi.com/api/weather.pm25
	 * FORMAT:http://api.k780.com/?app=weather.pm25&weaid=城市编号&appkey=APPKEY&sign=SIGN&format=json
	 */
	public static String getNowPM25(String cityNumber,String ak,String sg,String returnFormat) throws Exception{
		String str = "http://api.k780.com/?app=weather.pm25&weaid="+cityNumber+"&appkey="+ak+"&sign="+sg+"&format="+returnFormat;
		URL u = new URL(str);
		InputStream in = u.openStream();
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        try {
            byte buf[] = new byte[1024];
            int read = 0;
            while ((read = in.read(buf)) > 0) {
                out.write(buf, 0, read);
            }
        } finally {
            if (in != null) {
                in.close();
            }
        }
        byte b[] = out.toByteArray( );
		return new String(b,"utf-8");
	}
	/*
	 * 005.获取生活指数5-7天
	 * @param 请求城市气象编码，请求APPKey，SignKey，返回数据格式
	 * @return JSON
	 * DOC：https://www.nowapi.com/api/weather.lifeindex
	 * FORMAT:http://api.k780.com/?app=weather.lifeindex&weaid=1&appkey=APPKEY&sign=SIGN&format=json
	 */
	public static String getLifeIndex(String cityNumber,String ak,String sg,String returnFormat) throws Exception{
		String str = "http://api.k780.com/?app=weather.lifeindex&weaid="+cityNumber+"&appkey="+ak+"&sign="+sg+"&format="+returnFormat;
		URL u = new URL(str);
		InputStream in = u.openStream();
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        try {
            byte buf[] = new byte[1024];
            int read = 0;
            while ((read = in.read(buf)) > 0) {
                out.write(buf, 0, read);
            }
        }  finally {
            if (in != null) {
                in.close();
            }
        }
        byte b[] = out.toByteArray( );
		return new String(b,"utf-8");
	}
	/*
	 * 006.获取城市列表
	 * @param 请求APPKey，SignKey，返回数据格式
	 * @return JSON
	 * DOC:https://www.nowapi.com/api/weather.city
	 * FORMAT:http://api.k780.com/?app=weather.city&appkey=APPKEY&sign=SIGN&format=json
	 */
	public static String getCityList(String ak,String sg,String returnFormat) throws Exception{
		String str = "http://api.k780.com/?app=weather.city&appkey="+ak+"&sign="+sg+"&format="+returnFormat;
		URL u = new URL(str);
		InputStream in = u.openStream();
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        try {
            byte buf[] = new byte[1024];
            int read = 0;
            while ((read = in.read(buf)) > 0) {
                out.write(buf, 0, read);
            }
        }  finally {
            if (in != null) {
                in.close();
            }
        }
        byte b[] = out.toByteArray( );
		return new String(b,"utf-8");
	}
	/*
	 * 007.获取天气类型
	 * @param 请求城市气象编码，请求APPKey，SignKey，返回数据格式
	 * @return JSON
	 * DOC:https://www.nowapi.com/api/weather.wtype
	 * FORMAT:http://api.k780.com/?app=weather.wtype&appkey=APPKEY&sign=SIGN&format=json
	 */
	public static String getWeatherType(String ak,String sg,String returnFormat) throws Exception{
		String str = "http://api.k780.com/?app=weather.wtype&appkey="+ak+"&sign="+sg+"&format="+returnFormat;
		URL u = new URL(str);
		InputStream in = u.openStream();
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        try {
            byte buf[] = new byte[1024];
            int read = 0;
            while ((read = in.read(buf)) > 0) {
                out.write(buf, 0, read);
            }
        } finally {
            if (in != null) {
                in.close();
            }
        }
        byte b[] = out.toByteArray( );
		return new String(b,"utf-8");
	}
}
