package com.angularcrud.primeirocrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.angularcrud.primeirocrud.model.PessoaModel;
import com.angularcrud.primeirocrud.repository.PessoaRepository;



@RestController
@RequestMapping("api/testes")
@Component
@CrossOrigin("http://localhost:4200")
public class PessoaController {

   
    private final PessoaRepository pessoaRepository;

    public PessoaController (PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping()
    @ResponseBody()
    public List<PessoaModel> getAll(){
        return pessoaRepository.findAll();
    }
    
    @PostMapping
    public PessoaModel save(@RequestBody PessoaModel p){
        return pessoaRepository.save(p);
    }

   @GetMapping("api/testes/{id}")
   @ResponseBody()
   public Optional<PessoaModel> getById(@PathVariable(value = "id")Long id){
       return pessoaRepository.findById(id);
   }


   @DeleteMapping("api/testes/{id}")
   @ResponseBody()
   public void remove(@PathVariable Long id) {
        pessoaRepository.deleteById(id);

   }

    
}
