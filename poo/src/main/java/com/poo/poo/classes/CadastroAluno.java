package com.poo.poo.classes;

public class CadastroAluno {

        private static String cadastroAluno;
        private int idade;
        private String email;

        public CadastroAluno(String cadastroAluno, int idade, String email) {
            this.cadastroAluno = cadastroAluno;
            this.idade = idade;
            this.email = email;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public String getCadastroAluno() {
            return cadastroAluno;
        }

        public void setCadastroAluno(String cadastroAluno) {
            this.cadastroAluno = cadastroAluno;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
}
