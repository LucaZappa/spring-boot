package com.example.fincons;

//importo la libreria di spring
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//classe d'inializzaziione per le servelt
public class ServletInitializer extends SpringBootServletInitializer {

	//Faccio l'override della classe SpringApplicationBuilder e ritorno la BootableWebApplication
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BootableWebApplication.class);
	}

}
