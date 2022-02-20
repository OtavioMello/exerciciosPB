package br.com.aula.compasso;

public class Usuario {

    static String nome;
    static int acertos;
    static int erros;

    Usuario(String nome, int pontuacao, int erros){
        this.nome = nome;
        this.acertos = pontuacao;
        this.erros = erros;
        System.out.println("\n===================================\n" + nome + ", seja bem vindo(a)!!!" +
                "\n===================================\n\n");
    }

    static void exibePontuação(){
        System.out.println("=================================== \nUsuário: "
                + nome + "\nAcertos: "
                + acertos + "\nErros: "
                + erros + "\n===================================");
    }
}
