package br.com.hexagonal.application.core.domain;

public class FormularioDomain {

	private Long id;
	
	private String nome;
	
	private Integer zap;
	
	private String email;
	
	public FormularioDomain() {
		// TODO Auto-generated constructor stub
	}
	
	public FormularioDomain(Long id, String nome, Integer zap, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.zap = zap;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
