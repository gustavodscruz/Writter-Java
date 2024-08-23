package br.com.fiap.bean;

import java.io.BufferedReader;
import java.io.IOException;

public class Pessoa {
    private String codigo, nome, email;

    public Pessoa() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pessoa ler(String path) throws IOException{
        BufferedReader br = new BufferedReader();
    }
}
