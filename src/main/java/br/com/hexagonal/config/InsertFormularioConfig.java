package br.com.hexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.hexagonal.adapters.outPut.FindFormularioByIdAdapter;
import br.com.hexagonal.adapters.outPut.InsertFormularioAdapter;
import br.com.hexagonal.application.core.useCase.FindFormularioByIdUseCase;
import br.com.hexagonal.application.core.useCase.InsertFormularioUseCase;

@Configuration
public class InsertFormularioConfig {

	@Bean
	public InsertFormularioUseCase insertFormularioCase(InsertFormularioAdapter insertFormularioAdapter) {
		return new InsertFormularioUseCase(insertFormularioAdapter);		
	}
	
	@Bean
	public FindFormularioByIdUseCase findFormularioByIdUseCase(FindFormularioByIdAdapter findFormularioByIdAdapter) {		
		return new FindFormularioByIdUseCase(findFormularioByIdAdapter);
	}
}
