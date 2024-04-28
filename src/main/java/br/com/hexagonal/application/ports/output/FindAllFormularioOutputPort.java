package br.com.hexagonal.application.ports.output;

import java.util.List;

import br.com.hexagonal.application.core.domain.FormularioDomain;

public interface FindAllFormularioOutputPort {
	
	public List<FormularioDomain> findAll();

}
