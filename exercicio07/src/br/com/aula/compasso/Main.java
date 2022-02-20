package br.com.aula.compasso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //boolean responsável por inicializar o menu e manter ele rodando.
        boolean menu = true;
        Scanner scanner = new Scanner(System.in);

        //Chamada do método responsável por inicializar o ArrayList com os usuários pré gerados.
        Usuario.geraListaUsuario();

        //Enquanto menu = true esse do será executado.
        do {

            System.out.println("\n\n============================\n"
                            + "Bem vindo ao nosso sistema\n"
                            + "============================\n"
                            + "Selecione uma opção: \n"
                            + "1 - Logar \n0 - Sair\n");
            String opcaoMenu = scanner.nextLine();

            switch (opcaoMenu){

                case "1":

                    //Pega o nome e senha informados pelo usuário e armazena respectivamente nas variaveis inputNome e inputSenha.
                    System.out.println("Infome o nome: ");
                    String inputNome = scanner.nextLine();
                    System.out.println("Infome a senha: ");
                    String inputSenha = scanner.nextLine();

                    //if que faz a validação da conta utilizando o metodo validaConta, caso a conta exista é retornado true.
                    if(Usuario.validaConta(inputNome, inputSenha)){

                        //Chamada do método responsável por verificar o tempo da máquina e exibir a mensagem adequada.
                        Sistema.verificatempo(inputNome);
                    }else{
                        System.out.println("Usuário e/ou senha incorretos");
                    }

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
