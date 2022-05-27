package com.example.fincons.dto;

import java.io.Serializable;

import com.example.fincons.entities.ListTodo;

//in questa classe gestisco i DTO che provengono dal FE o dal service

public class ListDto implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String todo;
	private String status;
	private String datacreazione;
	private String datafine;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDatacreazione() {
		return datacreazione;
	}
	public void setDatacreazione(String datacreazione) {
		this.datacreazione = datacreazione;
	}
	public String getDatafine() {
		return datafine;
	}
	public void setDatafine(String datafine) {
		this.datafine = datafine;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	


}
