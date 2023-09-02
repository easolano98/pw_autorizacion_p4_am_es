package com.example.demo.service.TO;

import java.io.Serializable;

public class TokenTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	private String semilla;
	private Integer tiempo;
	
	// GET & SET
	public String getSemilla() {
		return semilla;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setSemilla(String semilla) {
		this.semilla = semilla;
	}

	public Integer getTiempo() {
		return tiempo;
	}

	public void setTiempo(Integer tiempo) {
		this.tiempo = tiempo;
	}

}
