package br.com.hexagonal.application.ports.output;

import br.com.hexagonal.application.core.domain.FormularioDomain;

public interface InsertFormularioOutPutPort {

	void insert(FormularioDomain formulario);
}
