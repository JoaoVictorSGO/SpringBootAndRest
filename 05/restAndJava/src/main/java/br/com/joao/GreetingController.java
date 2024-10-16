package br.com.joao;

import java.util.concurrent.atomic.AtomicLong; //Classe atomic nos permite trabalhar com numeros longs sem ter perigo de conflitos de dados ou mesmo erros por acessar varias vezes essa objeto.

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Controle de saudações
@RestController
public class GreetingController {
	private static final String template = "Hello, %s!"; //Template é "Modelos"
	private final AtomicLong counter = new AtomicLong();
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "word") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
 