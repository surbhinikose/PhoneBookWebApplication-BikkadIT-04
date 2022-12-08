package com.BikkadIT.PhoneBookWebApplication.exception;

import java.util.Date;

public class ApiResponse
{
  private Integer errodcode;
	
	private String erroDesc;
	
	private Date date;

	public Integer getErrodcode() {
		return errodcode;
	}

	public void setErrodcode(Integer errodcode) {
		this.errodcode = errodcode;
	}

	public String getErroDesc() {
		return erroDesc;
	}

	public void setErroDesc(String erroDesc) {
		this.erroDesc = erroDesc;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ApiResponse(Integer errodcode, String erroDesc, Date date) {
		super();
		this.errodcode = errodcode;
		this.erroDesc = erroDesc;
		this.date = date;
	}
	
	
	
	
}
