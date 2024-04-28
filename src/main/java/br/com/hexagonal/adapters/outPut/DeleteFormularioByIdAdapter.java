package br.com.hexagonal.adapters.outPut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hexagonal.adapters.outPut.repository.FormularioRepository;
import br.com.hexagonal.application.ports.output.DeleteFormularioByIdOutputPort;

@Service
public class DeleteFormularioByIdAdapter implements DeleteFormularioByIdOutputPort{

	@Autowired
	private FormularioRepository repository;
	
	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}
}
