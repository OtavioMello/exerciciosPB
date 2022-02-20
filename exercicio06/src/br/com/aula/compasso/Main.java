package br.com.aula.compasso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean menu = true;
        Scanner scanner = new Scanner(System.in);

        Pergunta.geraPergunta();

        do {
            System.out.println("============================ \nInforme a opção desejada: " +
                    "\n\n1 - Começar quiz\n0 - Sair\n============================ \n");
            int opcaoMenu = scanner.nextInt();

            switch (opcaoMenu){

                case 1:
                    System.out.println("\nPrimeiro, informe seu nome: ");
                    scanner.nextLine();
                    String inputNome = scanner.nextLine();
                    Usuario usuario = new Usuario(inputNome, 0, 0);
                    for (int i = 0; i < Pergunta.perguntas.size(); i++) {
                        System.out.println(Pergunta.perguntas.get(i).pergunta);
                        String inputResposta = scanner.nextLine();
                        Pergunta.validaPergunta(inputResposta, i);
                    }

                    Usuario.exibePontuação();
                    break;

                case 0:
                    System.out.println("Finalizando operação!");
                    menu = false;
                    break;

                default:
                    System.out.println("Operação não encontrada!\nAbortando operação");
                    menu = false;
                    break;
            }
        }while (menu == true);
    }
}
