package com.poo.poo.classes;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.poo.classes.Universidade;


@SpringBootApplication

public class MainApp1 {

		public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("\nSeja Bem Vindo a Universidade Senai");
            System.out.println(" 1 - Novo Cadastro:");
            System.out.println(" 2 - Acessar login");
            System.out.println(" 3 - Sair");
            
            System.out.println("\nDigite novo login:");
            String cadastroAluno = sc.nextLine();
            System.out.println("\nDigite nova senha: ");
            String cadastroSenha = sc.nextLine();

            System.out.println("\nCadastro realizado com sucesso!");
            System.out.println("\nDigite 9 - para retornar ao menu.");

    }
    }
