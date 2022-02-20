package br.com.aula.compasso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //boolean responsável por inicializar o menu e manter ele rodando.
        boolean menu = true;
        Scanner scanner = new Scanner(System.in);

        //Enquanto menu = true esse do será executado.
    do {
        System.out.println("============================\n" +
                "Informe a opção desejada: " +
                "\n1 - Cadastrar Funcionário" +
                "\n0 - Sair\n" +
                "============================\n");
        String opcaoMenu = scanner.nextLine();

        switch (opcaoMenu){
            case "1":

                //Pega a quantidade de funcionários que o usuário deseja cadastrar e salva na váriavel quantidadeDeFuncionarios
                // (sem tratamento para 0 funcionários).
                System.out.println("Infome a quantidade de funcionários: ");
                int quantidadeDeFuncionarios = scanner.nextInt();

                //for responsável por pegar o nome e salário dos funcionários.
                for (int i = 0; i < quantidadeDeFuncionarios; i++) {
                    scanner.nextLine();
                    System.out.println("Informe o nome do(a) " + (i+1) + "° funcionário(a): ");
                    String inputNome = scanner.nextLine();
                    System.out.println("Informe o salário: ");
                    double inputSalario = scanner.nextDouble();

                    //Chamada do método cadastraFuncionario, recebendo o nome e salário informados pelo usuário.
                    Funcionario.cadastraFuncionario(inputNome, inputSalario);
                }

                //Chamada do método validaSalario, que irá aplicar a regra de negócio e imprimir os resultados.
               Funcionario.validaSalario();

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
