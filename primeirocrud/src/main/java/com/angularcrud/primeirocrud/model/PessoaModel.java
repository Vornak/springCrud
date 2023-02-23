package com.angularcrud.primeirocrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoas")
public class PessoaModel {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome", length = 100, nullable = true)
    private String nome;

    @Column(name = "sobrenome", length = 150, nullable = true)
    private String sobrenome;

    @Column(name = "idade", length = 3, nullable = true)
    private String idade;

    @Column(name = "nascimento", length = 50, nullable = true)
    private String nascimento;

   @Column(name = "naturalidade", length = 100, nullable = true)
    private String naturalidade;




    public String getNaturalidade() {
    return naturalidade;
}

public void setNaturalidade(String naturalidade) {
    this.naturalidade = naturalidade;
}

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Column(name = "genero", length = 16, nullable = true)
    private String genero;



    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
