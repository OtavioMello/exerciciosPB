package br.com.aula.compasso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean menu = true;
        Scanner scanner = new Scanner(System.in);

    do {
        System.out.println("Informe a opção desejada: \n1 - Cadastrar Funcionário\n0 - Sair\n");
        int opcaoMenu = scanner.nextInt();

        switch (opcaoMenu){
            case 1:
                System.out.println("Infome a quantidade de funcionários: ");
                int quantidadeDeFuncionarios = scanner.nextInt();

                for (int i = 0; i < quantidadeDeFuncionarios; i++) {
                    scanner.nextLine();
                    System.out.println("Informe o nome do(a) " + (i+1) + "° funcionário(a): ");
                    String inputNome = scanner.nextLine();
                    System.out.println("Informe o salário: ");
                    double inputSalario = scanner.nextDouble();

                    Funcionario.cadastraFuncionario(inputNome, inputSalario);
                }

               Funcionario.validaSalario();

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
