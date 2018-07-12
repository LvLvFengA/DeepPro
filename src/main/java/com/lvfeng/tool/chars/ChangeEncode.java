package com.lvfeng.tool.chars;

import org.apache.commons.codec.binary.Base64;
/**
 * 需要支持库：commons-codec 当前maven依赖是V1.9
 * @author LvFeng
 * base64工具类
 */
public class ChangeEncode {
	//base64转byte
	public static byte[] base64ToByte(String base64str){
		//这需要引入jar包Commons-codec-1.5.jar
		return Base64.decodeBase64(base64str);
	}
	//byte转base64
	public static String byteToBase64(byte[] b){
		return Base64.encodeBase64String(b);
	}
}
