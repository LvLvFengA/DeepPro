package com.lvfeng.tool.pic;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author LvFeng
 * 图像处理的工具类
 *
 */
public class PicTool {
	//001这是一个静态的，在寻找你的路上，写出的一个byte
	public static byte[] readImagePathToByte(String path){
		byte[] data = null;				//如果开始是空
		FileInputStream input = null;	//那么我们之间就没有任何交谈
		try {							//我试着
			input = new FileInputStream(new File(path));				//找到这条路尽头的你
			ByteArrayOutputStream output = new ByteArrayOutputStream(); //找到你走过的痕迹
			byte[] buf = new byte[10240];								//一点一点捡起来，写进我的心底
			int num = 0;												//我开始
			while((num = input.read(buf)) != -1){						//在你存在的时候一点点记录
				output.write(buf,0,num);								//一字，一字
			}
			data = output.toByteArray();								//最后，成一本书
			output.close();				//把，想写的写完
			input.close();				//想说的说完
		} catch (FileNotFoundException e1) {							//不会因为失去你的存在而放弃
			e1.printStackTrace();		//我写着我唯一的，关于喜欢你的异常
		}catch(IOException e2){			//没有了想说的话
			e2.printStackTrace();		//就把心情写在console
		}
		return data;					//一定会有那么一天，我会让你知道一切，而此时，我已身在他乡……
	}
	//002图片转输入流
	public static FileInputStream readImage(String path)throws IOException{
		return new FileInputStream (new File(path));
	}
	
	/**
	 * 003定义一个方法，传入base64》》》文本文件
	 * @param:传入图像的base64和图像路径
	 */
	public String addPicToText(String path){
		//创建文件，按照服务器路径
		File input_file = new File(path);
		//创建文件，在本地
		File locaol_file = new File("E:\\");								
		try {
			//创建文件输入流，读取文件的信息
			InputStream fi = new FileInputStream(input_file);
			/*
			 * 可以用来写入文件
			 */
			Date date = new Date();
			//定义时间格式
			SimpleDateFormat sb = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
			//打个时间戳，用来当做文件名
			String s = String.valueOf(System.currentTimeMillis()).substring(0,9);
			String ss = "图片" + s;	//完整的时间戳												
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
}
