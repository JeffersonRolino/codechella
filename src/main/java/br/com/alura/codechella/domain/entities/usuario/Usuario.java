package br.com.alura.codechella.domain.entities.usuario;

import java.time.LocalDate;

public class Usuario {
    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private String email;

    //***********************************************************************
    // CONSTRUCTORS
    //***********************************************************************
    public Usuario(String cpf, String nome, LocalDate nascimento, String email) {
        if(cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")){
            throw new IllegalArgumentException("Cpf no padrão incorreto!");
        }

        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
    }

    //***********************************************************************
    // GETTERS AND SETTERS
    //***********************************************************************
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
