package com.lvfeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author LvFeng
 * 启动类拥有的权限最高，必须放在java包的根级，借此扫描全部配置和资源
 *
 */
@SpringBootApplication
public class SpringbootAppRun {
//spring程序启动类
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAppRun.class, args);
		//BootSchool Banner Generate:http://www.bootschool.net/ascii
		System.out.println("");
		System.out.print(" _|_|_|                                          _|_|_|                   \n"
				+ " _|    _|     _|_|       _|_|     _|_|_|         _|    _|   _|  _|_|     _|_|    \n"
				+ " _|    _|   _|_|_|_|   _|_|_|_|   _|    _|       _|_|_|     _|_|       _|    _|  \n"
				+ " _|    _|   _|         _|         _|    _|       _|         _|         _|    _|  \n"
				+ " _|_|_|       _|_|_|     _|_|_|   _|_|_|         _|         _|           _|_|    \n"
				+ "                                  _|                                             \n"
				+ "                                  _|                  >>>>>>Deep Pro RUN SUCCESS!\n"
				+ "终于等到你，还好我没放弃~>>>DeepPro启动成功，欢迎使用！\n");
	}
}
