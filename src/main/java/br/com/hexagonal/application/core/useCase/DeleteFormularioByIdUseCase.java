package br.com.hexagonal.application.core.useCase;



import br.com.hexagonal.application.ports.input.DeleteFormularioByIdInputPort;
import br.com.hexagonal.application.ports.output.DeleteFormularioByIdOutputPort;

public class DeleteFormularioByIdUseCase implements DeleteFormularioByIdInputPort{
	
	private final DeleteFormularioByIdOutputPort deleteFormularioByIdOutputPort;	
	
	public DeleteFormularioByIdUseCase(DeleteFormularioByIdOutputPort deleteFormularioByIdOutputPort) {
		this.deleteFormularioByIdOutputPort = deleteFormularioByIdOutputPort;		
	}

	@Override
	public void deleteById(Long id) {
		deleteFormularioByIdOutputPort.deleteById(id);
		
	}

}
