package br.com.aula.compasso;

import java.util.ArrayList;

public class Pergunta {

    String pergunta;
    String resposta;
    static ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();

    Pergunta(String pergunta, String resposta){
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    static void geraPergunta(){
        perguntas.add(new Pergunta("Qual o resultado de 2 + 2", "4"));
        perguntas.add(new Pergunta("Qual a melhor empresa do mundo?", "Compasso.UOL"));
        perguntas.add(new Pergunta("Fui puxa saco na última pergunta?", "Não"));
        perguntas.add(new Pergunta("Qual o nome da linguagem de programação utilizada nesse exercicío?", "Java"));
    }

    static void validaPergunta(String inputResposta, int indexPergunta){
        if (inputResposta.equals(perguntas.get(indexPergunta).resposta)){
            System.out.println("Resposta correta! Você ganhou um ponto\n");
            Usuario.acertos = Usuario.acertos + 1;
        }else {
            System.out.println("Resposta errada! O correto é: " + perguntas.get(indexPergunta).resposta + "\n");
            Usuario.erros = Usuario.erros + 1;
        }
    }
}
