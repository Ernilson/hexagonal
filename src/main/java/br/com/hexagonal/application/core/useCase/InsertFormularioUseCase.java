package br.com.hexagonal.application.core.useCase;

import br.com.hexagonal.application.core.domain.FormularioDomain;
import br.com.hexagonal.application.ports.input.InsertFormuarioInputPort;
import br.com.hexagonal.application.ports.output.InsertFormularioOutPutPort;

public class InsertFormularioUseCase implements InsertFormuarioInputPort{

	private final InsertFormularioOutPutPort findFormularioOutPutPort;
	
	public InsertFormularioUseCase(InsertFormularioOutPutPort findFormularioOutPutPort) {
		this.findFormularioOutPutPort = findFormularioOutPutPort;
	}
	
	public void insert(FormularioDomain domain) {
		findFormularioOutPutPort.insert(domain);
	}
}
