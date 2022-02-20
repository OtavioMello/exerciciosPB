package br.com.aula.compasso;

import java.util.ArrayList;

public class Pergunta {

    String pergunta;
    String resposta;
    static ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();

    //Construtor de Pergunta.
    Pergunta(String pergunta, String resposta){
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    //Método para adicionar perguntas e respostas no ArrayList perguntas.
    static void geraPergunta(){
        perguntas.add(new Pergunta("Qual o resultado de 2 + 2", "4"));
        perguntas.add(new Pergunta("Qual a melhor empresa do mundo?", "Compasso"));
        perguntas.add(new Pergunta("Fui puxa saco na última pergunta?", "Não"));
        perguntas.add(new Pergunta("Qual o nome da linguagem de programação utilizada nesse exercicío?", "Java"));
    }

    //Método que irá comparar as respostas inseridas pelo usuário com as do ArrayList, tendo como base o indexPergunta passado pelo for da classe Main.
    static void validaPergunta(String inputResposta, int indexPergunta){
        if (inputResposta.equals(perguntas.get(indexPergunta).resposta)){
            System.out.println("Resposta correta! Você ganhou um ponto\n");
            Usuario.acertos += 1;
        }else {
            System.out.println("Resposta errada! O correto é: " + perguntas.get(indexPergunta).resposta + "\n");
            Usuario.erros += 1;
        }
    }
}
