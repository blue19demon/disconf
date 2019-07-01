package com.apollo.config;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.model.ConfigChange;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;
@ToString
@Component
@Data
@ConfigurationProperties
@EnableApolloConfig("TEST1.mq")
public class MQConfig implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Value("${mq.serverUrl}")
	private String serverUrl;
	@Value("${mq.userName}")
	private String userName;
	@Value("${mq.password}")
	private String password;
	
	
}