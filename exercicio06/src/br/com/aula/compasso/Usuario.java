package br.com.aula.compasso;

public class Usuario {

    static String nome;
    static int acertos;
    static int erros;

    //Contrutor de usuário.
    Usuario(String nome, int pontuacao, int erros){
        this.nome = nome;
        this.acertos = pontuacao;
        this.erros = erros;

        System.out.println("\n===================================\n"
                + nome + ", seja bem vindo(a)!!!"
                + "\n===================================\n\n");
    }

    //Método responsável por exibir o nome do usuário e sua pontuação no final.
    static void exibePontuação(){
        System.out.println("=================================== \n" +
                "Usuário: " + nome
                + "\nAcertos: " + acertos
                + "\nErros: " + erros
                + "\n===================================");
    }
}
