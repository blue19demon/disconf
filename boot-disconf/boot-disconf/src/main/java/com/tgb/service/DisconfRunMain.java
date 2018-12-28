package com.tgb.service;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.alibaba.fastjson.JSONObject;
 
@SpringBootApplication
@ImportResource({ "classpath:applicationContext.xml" })
// 引入disconf
public class DisconfRunMain{
 
	public static void main(String args[]) {

		SpringApplication.run(DisconfRunMain.class, args);
 
	}
}
