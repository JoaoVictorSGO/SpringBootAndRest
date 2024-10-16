package br.com.joao;

public class MinhaSaudacao {
	private final long id;
	private final String content;
	public MinhaSaudacao(long id, String content) {
		this.id = id;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
}
