package br.com.hexagonal.application.ports.input;

import java.util.List;

import br.com.hexagonal.application.core.domain.FormularioDomain;

public interface FindAllFormularioInputPort {

	public List<FormularioDomain> findAll();
}
