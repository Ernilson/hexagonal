package br.com.hexagonal.adapters.outPut.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_formulario")
public class FormularioEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;

	private Integer zap;

	private String email;
	
	public FormularioEntity() {
		// TODO Auto-generated constructor stub
	}

	public FormularioEntity(Long id, String nome, Integer zap, String email) {
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FormularioEntity other = (FormularioEntity) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "FormularioEntity [id=" + id + ", nome=" + nome + ", zap=" + zap + ", email=" + email + "]";
	}
	
	
}
