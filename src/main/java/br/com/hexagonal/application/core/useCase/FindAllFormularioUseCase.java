package br.com.hexagonal.application.core.useCase;

import java.util.List;

import br.com.hexagonal.application.core.domain.FormularioDomain;
import br.com.hexagonal.application.ports.input.FindAllFormularioInputPort;
import br.com.hexagonal.application.ports.output.FindAllFormularioOutputPort;

public class FindAllFormularioUseCase implements FindAllFormularioInputPort{
	
	private FindAllFormularioOutputPort findAllFormularioOutputPort;
	
	public FindAllFormularioUseCase(FindAllFormularioOutputPort findAllFormularioOutputPort) {
		this.findAllFormularioOutputPort = findAllFormularioOutputPort;
	}

	@Override
	public List<FormularioDomain> findAll() {
		List<FormularioDomain> domain = findAllFormularioOutputPort.findAll();
		if (domain == null) {			
			 throw new IllegalStateException("A lista de formulários retornada é nula.");
	    }
	    return domain;
	}

}
