package br.com.hexagonal.adapters.outPut.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hexagonal.adapters.outPut.entity.FormularioEntity;

@Repository
public interface FormularioRepository extends JpaRepository<FormularioEntity, Long> {

}
