package br.com.hexagonal.application.core.useCase;

import br.com.hexagonal.application.core.domain.FormularioDomain;
import br.com.hexagonal.application.ports.input.FindFormularioByIdInputPort;
import br.com.hexagonal.application.ports.output.FindFormularioByIdOutputPort;

public class FindFormularioByIdUseCase implements FindFormularioByIdInputPort{
	
	private final FindFormularioByIdOutputPort findFormularioByIdOutputPort;
	
	
	public FindFormularioByIdUseCase(FindFormularioByIdOutputPort findFormularioByIdOutputPort) {
		this.findFormularioByIdOutputPort = findFormularioByIdOutputPort;
	}
	
	@Override
	public FormularioDomain find(Long id) {
		return findFormularioByIdOutputPort.find(id).orElseThrow(
				()-> new RuntimeException("Esse Formulario não foi encontrado" + id));
		
	}

}

