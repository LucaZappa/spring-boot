package com.example.fincons.utils;

import com.example.fincons.dto.ListDto;
import com.example.fincons.entities.ListTodo;

public class ListUtils {
	
	//Questa classe mi permette di trasformare un vo in un dto e vicervarsa, viene utilizzata nel service
	
	public static ListTodo fromDtoToVo(ListDto listDto) {
		ListTodo listTodo = new ListTodo();
		listTodo.setId(listDto.getId());
		listTodo.setTodo(listDto.getTodo());
		listTodo.setStatus(listDto.getStatus());
		listTodo.setDateCreazione(listDto.getDatacreazione());
		listTodo.setDataFine(listDto.getDatafine());
		return listTodo;
		}
	
	public static ListDto fromVoToDto(ListTodo listTodo) {
		ListDto listDto = new ListDto();
		listDto.setId(listTodo.getId());
		listDto.setTodo(listTodo.getTodo());
		listDto.setStatus(listTodo.getStatus());
		listDto.setDatacreazione(listTodo.getDateCreazione());
		listDto.setDatafine(listTodo.getDataFine());
		return listDto;
		}
	
	

}
