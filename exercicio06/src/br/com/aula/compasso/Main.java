package br.com.aula.compasso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //boolean responsável por inicializar o menu e manter ele rodando.
        boolean menu = true;
        Scanner scanner = new Scanner(System.in);

        //Chamada do método responsável por inicializar o ArrayList com as perguntas pré determinadas.
        Pergunta.geraPergunta();

        //Enquanto menu = true esse do será executado.
        do {
            System.out.println("============================ \n" +
                    "Informe a opção desejada: " +
                    "\n\n1 - Começar quiz" +
                    "\n0 - Sair\n\n" +
                    "============================ \n");
            String opcaoMenu = scanner.nextLine();

            switch (opcaoMenu){

                case "1":

                    //Cria um novo Usuario com o nome recebido e as pontuações devidamente zeradas.
                    System.out.println("\nPrimeiro, informe seu nome: ");
                    String inputNome = scanner.nextLine();
                    Usuario usuario = new Usuario(inputNome, 0, 0);

                    //for responsável por listar as perguntas do ArrayList e receber as respostas na variavel inputResposta.
                    for (int i = 0; i < Pergunta.perguntas.size(); i++) {
                        System.out.println(Pergunta.perguntas.get(i).pergunta);
                        String inputResposta = scanner.nextLine();

                        //Chamada do método que irá validar a resposta inserida, recebendo como parametro a resposta inserida e o index
                        // para comparação no ArrayList (validação case sensitive).
                        Pergunta.validaPergunta(inputResposta, i);
                    }

                    //Chamada do método que irá exibir a pontuação do usuário.
                    Usuario.exibePontuação();
                    break;

                case "0":

                    //Caso seja selecionada a opção 0 - Sair, será exibida a mensagem a seguir e a variavel menu receberá false, saindo do looping.
                    System.out.println("Finalizando operação!");
                    menu = false;
                    break;

                default:

                    //Caso nenhuma opção válida seja selecionada a variavel menu receberá false, o processo será abortado.
                    System.out.println("Operação não encontrada!\nAbortando operação");
                    menu = false;
                    break;
            }
        }while (menu == true);
    }
}
