package br.com.aula.compasso;

import java.util.ArrayList;

public class Funcionario {

    String nome;
    private double salario;
    private static double salarioLiquido;
    private static float porcentagem;
    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    //Contrutor de Funcionarios.
    Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    //Método para adicionar um novo funcionário ao ArrayList, recebe nome e salário informados pelo usuário.
    static void cadastraFuncionario(String inputNome, double inputSalario){
        funcionarios.add(new Funcionario(inputNome, inputSalario));
    }

    //Método que passa pelo ArrayList e faz a validação do valor de salário seguindo a regra de negócio.
    static void validaSalario(){
        for (int i = 0; i < funcionarios.size(); i++) {

            double salarioAtual = funcionarios.get(i).salario;
            if (salarioAtual < 1000){
                porcentagem = 0.20f;
                salarioLiquido = salarioAtual + (salarioAtual * porcentagem);
                System.out.println("====================================");
                System.out.println("Nome: " + funcionarios.get(i).nome);
                System.out.printf("Salário: R$%,.2f %n", salarioAtual);
                System.out.printf("Bonus: R$%,.2f %n", salarioAtual * porcentagem);
                System.out.printf("Salário Liquido: R$%,.2f %n", salarioLiquido);
                System.out.println("====================================");
            }else if(salarioAtual >= 1000 && salarioAtual < 2000){
                porcentagem = 0.10f;
                salarioLiquido = salarioAtual + (salarioAtual * porcentagem);
                System.out.println("====================================");
                System.out.println("Nome: " + funcionarios.get(i).nome);
                System.out.printf("Salário: R$%,.2f %n", salarioAtual);
                System.out.printf("Bonus: R$%,.2f %n", salarioAtual * porcentagem);
                System.out.printf("Salário Liquido: R$%,.2f %n", salarioLiquido);
                System.out.println("====================================");
            }else{
                porcentagem = 0.10f;
                salarioLiquido = salarioAtual - (salarioAtual * porcentagem);
                System.out.println("====================================");
                System.out.println("Nome: " + funcionarios.get(i).nome);
                System.out.printf("Salário: R$%,.2f %n", salarioAtual);
                System.out.printf("Desconto: R$%,.2f %n", salarioAtual * porcentagem);
                System.out.printf("Salário Liquido: R$%,.2f %n", salarioLiquido);
                System.out.println("====================================");
            }
        }
    }
}
