package com.example.fincons.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fincons.dto.ListDto;
import com.example.fincons.entities.ListTodo;
import com.example.fincons.services.ListService;

@RestController
@RequestMapping("/list")
public class ListController {
	
	@Autowired
	private ListService listService;
	
	@GetMapping("/{id}")
	public ListTodo getListById(@PathVariable ("id") Integer id) {
		ListTodo listTodo = listService.findListById(id);
		return listTodo;
		
	}
	
	@GetMapping("/listTodo")
	public List<ListDto> getAll(){
		List<ListDto> all = listService.findAll();
		return all;
	}

	@PostMapping
	public Integer create(@RequestBody ListDto list) {
		Integer in = listService.save(list);
		return in;
		}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id){
		listService.delete(id);
}
	@PutMapping("/{id}")
	public ListDto update(@PathVariable("id") Integer id, @RequestBody ListDto list){
		return listService.update(id, list);
		
		}
	}
