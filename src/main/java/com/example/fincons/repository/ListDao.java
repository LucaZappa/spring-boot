package com.example.fincons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fincons.entities.ListTodo;

//Questo è il repository che fa le interrogazioni verso il database
@Repository
public interface ListDao extends JpaRepository<ListTodo, Integer>{

}
