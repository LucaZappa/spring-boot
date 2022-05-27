package com.example.fincons.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.fincons.dto.ListDto;
import com.example.fincons.entities.ListTodo;
import com.example.fincons.repository.ListDao;
import com.example.fincons.utils.ListUtils;

////Questo è un servizio 
@Service
public class ListServiceImpl implements ListService {
	
	// fai l'injection dei get and setter nella userserviceimpl 
	@Autowired
	private ListDao listDao;
	
	// metodo che cerca un id della lista
	@Override
	@Transactional(propagation = Propagation.NEVER, readOnly = true)
	public ListTodo findListById(Integer id) {
		return listDao.findById(id).get();
	}
	
	//metodo findall, cerca tutti gli impegni presenti nel db
	@Override
	@Transactional(propagation = Propagation.NEVER, readOnly = true)
	public List<ListDto> findAll() {
		List<ListDto> listDto;
		List<ListTodo> lists = listDao.findAll();
		listDto= lists.stream().map(
			u -> ListUtils.fromVoToDto(u)).collect(Collectors.toList());	
				
		return listDto;
	}

	//metodo che salva un nuovo impegno
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Integer save(ListDto dto) {
		ListTodo listTodo= null;
		try {
		String string = dto.getStatus();
		System.out.println(string);
		  switch(string){  
	        case "TODO":{  
	        	listTodo= listDao.save(ListUtils.fromDtoToVo(dto));
	        	return listTodo.getId();
	            }  
	        case "IN_PROGRESS":{  
	        	listTodo= listDao.save(ListUtils.fromDtoToVo(dto));  
	        	return listTodo.getId();
	            }  
	        case "DONE":{  
	        	listTodo= listDao.save(ListUtils.fromDtoToVo(dto));
	        	return listTodo.getId();
	            }
	        
	        default:{   
	        	
	            System.out.println("Devi inseriri solo: TODO, IN_PROGRESS oppure DONE  ");
	            } 
	        }
		  System.out.println(dto.getStatus());
		  return null;
		  }
		catch (Exception e) {
			
			return null;
			
		}
	}
	
	
	//metodo che cancella un impegno

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(Integer id) {
		try {
		listDao.delete(listDao.findById(id).get());
		}
		catch (Exception e) {
			
			System.out.println("Errore");
			
		}
		
	}
	
	//metodo che aggiorna impegno


	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public ListDto update(Integer pk, ListDto dto) {
		
		try {
		ListTodo nLst = listDao.findById(pk).get();
		nLst.setTodo(dto.getTodo());
		String string = dto.getStatus();
		System.out.println(string);
		  switch(string){  
	        case "TODO":{  
	        	nLst.setStatus(dto.getStatus());;
	            }  
	        case "IN_PROGRESS":{  
	        	nLst.setStatus(dto.getStatus());
	            }  
	        case "DONE":{  
	        	nLst.setStatus(dto.getStatus());
	            }
	        
	        default:{   
	        	
	            System.out.println("Devi inseriri solo: TODO, IN_PROGRESS oppure DONE  ");
	            nLst.setStatus("TODO");
	            } 
	        }
		System.out.println(string);
		//nLst.setStatus(dto.getStatus());
		nLst.setDateCreazione(dto.getDatacreazione());
		nLst.setDataFine(dto.getDatafine());
		ListTodo listTodo = listDao.saveAndFlush(nLst);
		ListDto listDto = ListUtils.fromVoToDto(listTodo);
	
		return listDto;
		}
		catch (Exception e) {
			
			System.out.println("Errore");
			return null;
		}
	}

}
