package com.lvfeng.system.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author LvFeng
 * 返回首页
 */

@Configuration
@RequestMapping("/") 
public class DefaultView{
	public ModelAndView index() {
        return new ModelAndView("index");
    }
}
