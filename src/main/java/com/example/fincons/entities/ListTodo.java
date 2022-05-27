package com.example.fincons.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Qua dico a springboot che è un entità, l'unità più piccola di springboot ( in pratica un java bean)
@Entity
@Table(name = "list")
public class ListTodo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//Questa è la pk, ed è l'id della lista
	//Qua genero in automatico l'id, in modo da non doverlo inserire nel FE
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	//Nel todo viene inserito cosa devo fare, ovvero l'impegno
	
	@Column(name = "todo")
	private String todo;
	
	//Nello status invece inserisco tra TODO (da fare), inProgres (in svolgimento) e Done (fatto)

	@Column(name = "status")
	private String status;
	
	//Inserirsco la data di inizio della faccenda

	@Column(name = "datacreazione")
	private String dateCreazione;
	
	//inserisco la datat di fine della faccenda( non è obbligatoria)

	@Column(name = "datafine")
	private String dataFine;
	
	//Metodi della lista delle cose da fare (getter e setter)

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

	public String getDateCreazione() {
		return dateCreazione;
	}

	public void setDateCreazione(String dateCreazione) {
		this.dateCreazione = dateCreazione;
	}

	public String getDataFine() {
		return dataFine;
	}

	public void setDataFine(String dataFine) {
		this.dataFine = dataFine;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "List [id=" + id + ", todo=" + todo + ", status=" + status + ", dateCreazione=" + dateCreazione
				+ ", dataFine=" + dataFine + "]";
	}
	

	
	
	


}
