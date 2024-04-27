package br.com.hexagonal.adapters.outPut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hexagonal.adapters.outPut.entity.converters.FormularioConverter;
import br.com.hexagonal.adapters.outPut.repository.FormularioRepository;
import br.com.hexagonal.application.core.domain.FormularioDomain;
import br.com.hexagonal.application.ports.output.InsertFormularioOutPutPort;

@Service
public class InsertFormularioAdapter implements InsertFormularioOutPutPort{
	
	@Autowired
	private FormularioRepository repository;
	
	@Autowired
	private FormularioConverter converter;

	@Override
	public void insert(FormularioDomain formulario) {
		var formularioEntity = converter.toEntity(formulario);
		repository.save(formularioEntity);
	}
	
	

}
