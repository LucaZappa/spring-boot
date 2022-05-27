package com.example.fincons.services;

import java.util.List;


import com.example.fincons.dto.ListDto;
import com.example.fincons.entities.ListTodo;

//interfaccia relaitva al servizio della lista
public interface ListService {
	
	ListTodo findListById(Integer id);
	List<ListDto> findAll();
	Integer save(ListDto dto);
	void delete(Integer id);
	ListDto update(Integer pk, ListDto dto);

}
