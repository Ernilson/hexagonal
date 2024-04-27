package br.com.hexagonal.application.ports.output;

import java.util.Optional;

import br.com.hexagonal.application.core.domain.FormularioDomain;

public interface FindFormularioByIdOutputPort {
	
	Optional<FormularioDomain> find(Long id);

}
