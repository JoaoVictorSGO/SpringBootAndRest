package br.com.joao;

import java.util.concurrent.atomic.AtomicLong; //Classe atomic nos permite trabalhar com numeros longs sem ter perigo de conflitos de dados ou mesmo erros por acessar varias vezes essa objeto.

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.joao.exceptions.UnsuppotedMathOperationException;

// Controle de saudações
@RestController
public class MathController {

	
	//Quando não é operação do tipo String deve colocar value
	//È bom especificar o metodo (method)
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne, // Aqui vai ser nosso dois paramentros
			@PathVariable(value = "numberTwo") String numberTwo
			)throws Exception{
		if (!isNumeric(numberOne)|| !isNumeric(numberTwo)) {
			throw new  UnsuppotedMathOperationException("Please set a numeric value!");
		}
		
		return convertToDouble(numberOne) + convertToDouble(numberTwo);
	}

	

	private Double convertToDouble(String strNumber) {
		if (strNumber == null) return 0D;
		// BR 10,25, US 10.25, O programa deve aceitar das duas maneiras
		String number = strNumber.replaceAll(",", "."); //Toda virgula adicionada deve ser trocada
		if(isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}



	private boolean isNumeric(String strNumber) {
		if (strNumber == null)return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
		
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
 