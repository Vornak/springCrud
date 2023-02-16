package com.angularcrud.primeirocrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.angularcrud.primeirocrud.model.PessoaModel;

@Component
public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
    


}
