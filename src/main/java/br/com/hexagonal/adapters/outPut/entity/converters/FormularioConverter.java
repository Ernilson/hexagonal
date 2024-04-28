package br.com.hexagonal.adapters.outPut.entity.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.hexagonal.application.core.domain.FormularioDomain;
import br.com.hexagonal.adapters.inPut.controller.dtos.FormularioDTO;
import br.com.hexagonal.adapters.outPut.entity.FormularioEntity;

@Component
public class FormularioConverter {
	
    //Converte de Domain para Entity
    public FormularioEntity toEntity(FormularioDomain domain) {
        FormularioEntity entity = new FormularioEntity();
        entity.setId(domain.getId());
        entity.setNome(domain.getNome());
        entity.setEmail(domain.getEmail());
        entity.setZap(domain.getZap());
        return entity;
    }
    
    //Converte de Entity para Domain
    public FormularioDomain toDomain(FormularioEntity entity) {
        FormularioDomain domain = new FormularioDomain();
        domain.setId(entity.getId());
        domain.setNome(entity.getNome());
        domain.setEmail(entity.getEmail());
        domain.setZap(entity.getZap());
        return domain;
    }
    
    //Converte de DTO para Domain
    public FormularioDomain toDTO(FormularioDTO dto) {
    	FormularioDomain domain = new FormularioDomain();    	
    	domain.setNome(dto.getNome());
    	domain.setEmail(dto.getEmail());
    	domain.setZap(dto.getZap());
        return domain;
    }
    
    //Converte de Domain para DTO
    public FormularioDTO toDTO(FormularioDomain domain) {
    	FormularioDTO dto = new FormularioDTO();    	
    	dto.setNome(domain.getNome());
    	dto.setEmail(domain.getEmail());
    	dto.setZap(dto.getZap());
        return dto;
    }
    
  //Converte de Domain para Entity
    public List<FormularioEntity> toEntityList(List<FormularioDomain> formularioList) {
        List<FormularioEntity> entityList = new ArrayList<>();
        for (FormularioDomain formulario : formularioList) {
            FormularioEntity entity = new FormularioEntity();
            entity.setId(formulario.getId());
            entity.setNome(formulario.getNome());
            entity.setEmail(formulario.getEmail());
            entity.setZap(formulario.getZap());
            entityList.add(entity);
        }
        return entityList;
    }

}
