package br.com.aula.compasso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean menu = true;

        Scanner scanner = new Scanner(System.in);

        Usuario.geraListaUsuario();

        do {

            System.out.println("\n\n============================\n"
                            + "Bem vindo ao nosso sistema\n"
                            + "============================\n");

            System.out.println("Selecione uma opção: \n" +
                    "1 - Logar \n0 - Sair\n");
            int opcaoMenu = scanner.nextInt();

            switch (opcaoMenu){

                case 1:
                    scanner.nextLine();
                    System.out.println("Infome o nome: ");
                    String inputNome = scanner.nextLine();
                    System.out.println("Infome a senha: ");
                    String inputSenha = scanner.nextLine();

                    if(Usuario.validaConta(inputNome, inputSenha)){
                        Sistema.verificatempo(inputNome);
                    }else{
                        System.out.println("Usuário e/ou senha incorretos");
                    }

                break;

                case 0:
                    menu = false;
                    break;

                default:
                    System.out.println("Opção inválida, abortando operação!");
             }

        }while (menu == true);

    }

}
