package br.com.joao;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController // vai lidar com requesição http e devolver um json também mostra que a classe é uma classe controlador
//@controller vai lidar com a requesicção http e procurar uma pagina html(views),e mostror que a classe é um controler
//@responseBody essa anotação vai converter a htlm e um arquivo json



public class MinhaSudaçãoController {
	private static final String modelo = "Olá, %s!";
	private final AtomicLong contador = new AtomicLong();
	
	@RequestMapping("/minhaSaudacao")
	public MinhaSaudacao minhaSaudacao(@RequestParam(value =  "name",  defaultValue = "Todos") String name) {
		return new MinhaSaudacao(contador.incrementAndGet(), String.format(modelo, name));
	}
	
}
	
