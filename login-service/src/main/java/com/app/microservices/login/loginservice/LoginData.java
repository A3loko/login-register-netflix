package com.app.microservices.login.loginservice;

public class LoginData {
	
	private Long id;
	private String username;
	private String password;
	private int port;
	
	public LoginData() {
	
	}
	
	public LoginData(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	

}
