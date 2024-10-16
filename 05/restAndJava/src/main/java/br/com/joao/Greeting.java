package br.com.joao;
//Esse arquivo vai devolver um json, id e conteudo

// Essa classe se chama saudações
public class Greeting {
	private final long id; // uma variavel que vai ser o id
	private final String content; // Variavel que vai conter o conteudo
	
	// Passando para um contrutor
	public Greeting(long id, String content) {  
		this.id = id;
		this.content = content;
	}
	
	public long getId() { // Retornar o id
		return id;
	}
	public String getContent() { // Retonar o conteudo
		return content;
	}
}
