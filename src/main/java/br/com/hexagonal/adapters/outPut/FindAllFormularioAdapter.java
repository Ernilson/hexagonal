package br.com.hexagonal.adapters.outPut;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hexagonal.adapters.outPut.entity.FormularioEntity;
import br.com.hexagonal.adapters.outPut.entity.converters.FormularioConverter;
import br.com.hexagonal.adapters.outPut.repository.FormularioRepository;
import br.com.hexagonal.application.core.domain.FormularioDomain;
import br.com.hexagonal.application.ports.output.FindAllFormularioOutputPort;

@Service
public class FindAllFormularioAdapter implements FindAllFormularioOutputPort{
	
	@Autowired
	private FormularioRepository repository;
	
	@Autowired
	private FormularioConverter converter; 

	@Override
	public List<FormularioDomain> findAll() {
	    List<FormularioEntity> formularioEntities = repository.findAll();
	    return formularioEntities.stream()
	                             .map(entity -> converter.toDomain(entity))
	                             .collect(Collectors.toList());
	}


	
}
