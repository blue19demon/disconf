package com.tgb.disconf.prop;

import java.io.Serializable;

import org.springframework.context.annotation.Configuration;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;

@Configuration
@DisconfFile(filename = "mysql.properties")
public class MysqlConfig implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private String driver;
	private String url;
	private String username;
	private String password;
	private String foo;


	@DisconfFileItem(name = "jdbc.driver", associateField = "driver")
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
	@DisconfFileItem(name = "jdbc.url", associateField = "url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	@DisconfFileItem(name = "jdbc.username", associateField = "username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	@DisconfFileItem(name = "jdbc.password", associateField = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@DisconfFileItem(name = "foo.url", associateField = "foo")
	public String getFoo() {
		return foo;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}
}
