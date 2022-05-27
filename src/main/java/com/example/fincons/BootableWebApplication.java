package com.example.fincons;

//
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

//Permette di caricare automaticamente il vecchio configurationBean
@SpringBootApplication
//Permette di slezionare in uscita il frontend, tra l'applicazione angular oppure l'applicazione mobile
@CrossOrigin("http://localhost:4200")
public class BootableWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(BootableWebApplication.class, args);
	}
}

