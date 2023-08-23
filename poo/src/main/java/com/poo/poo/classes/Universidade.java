package com.poo.poo.classes;

public class Universidade {
    private int cnpj;
    private String endereco;
    private int id;
    private String nome;

    public Universidade(int cnpj, String endereco, int id, String nome) {
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.id = id;
        this.nome = nome;
    }

    // Getters e Setters para os atributos

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para exibir informações da universidade

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println("ID: " + id);
    }
}
