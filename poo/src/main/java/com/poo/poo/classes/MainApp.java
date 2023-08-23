package com.poo.poo.classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Aluno {
    private static int contadorMatriculas = 1;
    private String nome;
    private Date dataNascimento;
    private int matricula;

    public Aluno(String nome, Date dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.matricula = contadorMatriculas++;
    }

    public Aluno(String string, String string2, int i) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void exibirInformacoes() {
    }
}

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Aluno");
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a data de nascimento do aluno (DD/MM/AAAA): ");
        String dataNascimentoStr = scanner.nextLine();

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date dataNascimento = dateFormat.parse(dataNascimentoStr);

            Aluno aluno = new Aluno(nome, dataNascimento);

            System.out.println("\nDados do Aluno:");
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Data de Nascimento: " + dateFormat.format(aluno.getDataNascimento()));
            System.out.println("Matrícula: " + aluno.getMatricula());
        } catch (Exception e) {
            System.out.println("Erro ao processar os dados do aluno.");
        }
    }
}
