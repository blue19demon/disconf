package com.apollo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apollo.config.DBConfig;
import com.apollo.config.MQConfig;
import com.apollo.config.ZKConfig;
import com.google.gson.Gson;

@RestController
@RequestMapping("/platfrorm")
public class PlatformConfController {

	@Autowired
	private DBConfig DBConfig;
	
	@Autowired
	private MQConfig MQConfig;
	
	@Autowired
	private ZKConfig ZKConfig;
	
	@RequestMapping("/config")
	public String config() {
		 Gson json=new  Gson();
		return "DBConfig:<br>"+json.toJson(DBConfig)
		        .concat("<br>")
				.concat("MQConfig:<br>"+json.toJson(MQConfig))
				.concat("<br>")
				.concat("ZKConfig:<br>"+json.toJson(ZKConfig));
	}
}
