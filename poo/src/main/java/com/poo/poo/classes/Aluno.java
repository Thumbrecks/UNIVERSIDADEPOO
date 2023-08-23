package com.poo.poo.classes;

public class Aluno {
    private String nome;
    private String endereco;
    private int id;
    private long cpf;

    public Aluno(String nome, String endereco, int id, long cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.id = id;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Endereço: " + endereco);
        System.out.println("CPF: " + cpf);
    }
}
