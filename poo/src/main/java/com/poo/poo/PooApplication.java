package com.poo.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.poo.classes.Curso;
import com.poo.poo.classes.Universidade;
import com.poo.poo.classes.Aluno;

@SpringBootApplication
public class PooApplication {

    public static void main(String[] args) {
        SpringApplication.run(PooApplication.class, args);

        Universidade minhaUniversidade = new Universidade(123456789, "\nRua da Universidade, 123", 1, "Universidade SENAI");
		System.out.println("\n");
        minhaUniversidade.exibirInformacoes();

        Curso curso1 = new Curso("Administração", 1);
        Curso curso2 = new Curso("Direito", 2);
        Curso curso3 = new Curso("Engenharia", 3);
        Curso curso4 = new Curso("Desenvolvedor", 4);

        System.out.println("\nCurso: " + curso1.getNome() + ", ID: " + curso1.getId());
        System.out.println("Curso: " + curso2.getNome() + ", ID: " + curso2.getId());
        System.out.println("Curso: " + curso3.getNome() + ", ID: " + curso3.getId());
        System.out.println("Curso: " + curso4.getNome() + ", ID: " + curso4.getId());
		System.out.println("\n");

        
		Aluno aluno1 = new Aluno("João", "Rua A, 123", 1, 12345612258L);
        Aluno aluno2 = new Aluno("Maria", "Rua B, 125", 2, 12345688891L);
        Aluno aluno3 = new Aluno("Ricardo", "Rua C, 128", 3, 12345688891L);

        aluno1.exibirInformacoes();
        System.out.println("-------------------------");
        aluno2.exibirInformacoes();
		System.out.println("-------------------------");
        aluno3.exibirInformacoes();
    }
}
