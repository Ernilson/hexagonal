package br.com.hexagonal.application.ports.input;

import br.com.hexagonal.application.core.domain.FormularioDomain;

public interface InsertFormuarioInputPort {
	
	void insert(FormularioDomain domain);

}
