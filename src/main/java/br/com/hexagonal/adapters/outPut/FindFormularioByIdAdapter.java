package br.com.hexagonal.adapters.outPut;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hexagonal.adapters.outPut.entity.converters.FormularioConverter;
import br.com.hexagonal.adapters.outPut.repository.FormularioRepository;
import br.com.hexagonal.application.core.domain.FormularioDomain;
import br.com.hexagonal.application.ports.output.FindFormularioByIdOutputPort;

@Service
public class FindFormularioByIdAdapter implements FindFormularioByIdOutputPort{

	@Autowired
	private FormularioRepository repository;
	
	@Autowired
	private FormularioConverter converter; 
	
	
	@Override
	public Optional<FormularioDomain> find(Long id) {
		var formularioEntity = repository.findById(id);
		return formularioEntity.map(entity -> converter.toDomain(entity));
	}

}
