package com.bytecode.beans;

public class DBConnection {
	private String driverClassName;
	private String url;
	private String user;
	private String pass;

	public DBConnection() {
		System.out.println("0 param constructor");
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "DBConnection [driverClassName=" + driverClassName + ", url=" + url + ", user=" + user + ", pass=" + pass
				+ "]";
	}
	
	
}
