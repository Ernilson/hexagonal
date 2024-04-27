package br.com.hexagonal.adapters.inPut.controller.dtos;

public class FormularioDTO {

	private String nome;

	private Integer zap;

	private String email;
	
	public FormularioDTO() {
		// TODO Auto-generated constructor stub
	}

	public FormularioDTO(String nome, Integer zap, String email) {
		super();
		this.nome = nome;
		this.zap = zap;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getZap() {
		return zap;
	}

	public void setZap(Integer zap) {
		this.zap = zap;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
