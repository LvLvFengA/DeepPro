package com.lvfeng.tool.baidu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
/**
 * 
 * @author LvFeng
 * version 2.0
 * 获取临时token
 *	
 */
public class AuthService {
	/*
	 * 获取API访问token
	 * 获取到官网tooken用来写入HTML头部区分用户访问的，可以将此token插入其它语言中方便接口的调用
	 */
	public String getAuth(String ak, String sk) {
		//01获取token地址
		String authHost = "https://aip.baidubce.com/oauth/2.0/token?";
		//02拼接URL请求报头
		String getAccessTokenUrl = authHost
				// 1. grant_type为固定参数
				+ "grant_type=client_credentials"
				// 2. 官网获取的 API Key
				+ "&client_id=" + ak
				// 3. 官网获取的 Secret Key
				+ "&client_secret=" + sk;
		try {
			//创建URL对象
			URL realUrl = new URL(getAccessTokenUrl);
			//打开URL连接
			HttpURLConnection conn = (HttpURLConnection) realUrl.openConnection();
			//连接请求方式
			conn.setRequestMethod("GET");
			//正式连接
			conn.connect();
			//获取所有响应头字段
			Map<String, List<String>> map = conn.getHeaderFields();
			//增强型for循环遍历响应头(数据类型：遍历的对象)
			for (String key : map.keySet()) {
				System.err.println(key + "------->" + map.get(key));
			}
			//定义BufferedReader输入流来读取URL响应
			BufferedReader bf_in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			//返回结果字符串
			String result = "";
			String line;
			while((line = bf_in.readLine()) != null){
				result += line;
			}
			//返回结果
			System.err.println("返回结果result:" + result);
			//创建Json字符串请求对象
			JSONObject jsonObj = new JSONObject(result);
			//保存获取到的字符串
			String access_token = jsonObj.getString("access_token");
			//返回token
			return access_token;
		} catch (Exception e) {
			System.err.println("获取token失败");
			e.printStackTrace(System.err);
		}
		return null;
	}
}
