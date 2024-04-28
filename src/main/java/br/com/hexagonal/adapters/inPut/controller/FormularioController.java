package br.com.hexagonal.adapters.inPut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.hexagonal.application.ports.input.FindAllFormularioInputPort;
import br.com.hexagonal.adapters.inPut.controller.dtos.FormularioDTO;
import br.com.hexagonal.adapters.outPut.entity.FormularioEntity;
import br.com.hexagonal.adapters.outPut.entity.converters.FormularioConverter;
import br.com.hexagonal.application.ports.input.FindFormularioByIdInputPort;
import br.com.hexagonal.application.ports.input.InsertFormuarioInputPort;

@RestController
@RequestMapping("/formulario")
public class FormularioController {

	@Autowired
	private InsertFormuarioInputPort insertFormuarioInputPort;
		
	@Autowired
	private FindFormularioByIdInputPort findFormularioByIdInputPort;
	
	@Autowired
	private FindAllFormularioInputPort findAllFormularioInputPort;
	
	@Autowired
	private FormularioConverter converter;
	
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody FormularioDTO dto){		
		var formulario = converter.toDTO(dto);
		insertFormuarioInputPort.insert(formulario);
		return ResponseEntity.ok().build();		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<FormularioEntity> findById(@PathVariable final Long id){
		var formulario = findFormularioByIdInputPort.find(id);
		var dto = converter.toEntity(formulario);
		return ResponseEntity.ok().body(dto);
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<FormularioEntity>> findAll(){
		var formulario = findAllFormularioInputPort.findAll();
		var dto = converter.toEntityList(formulario);
		return ResponseEntity.ok().body(dto);
	}

}
