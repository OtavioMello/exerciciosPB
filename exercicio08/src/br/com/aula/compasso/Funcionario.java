package br.com.aula.compasso;

import java.util.ArrayList;

public class Funcionario {

    String nome;
    double salario;
    static double salarioLiquido;
    static float porcentagem;
    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    static void cadastraFuncionario(String inputNome, double inputSalario){
        funcionarios.add(new Funcionario(inputNome, inputSalario));
    }

    static double validaSalario(){
        for (int i = 0; i < funcionarios.size(); i++) {

            double salarioAtual = funcionarios.get(i).salario;
            if (salarioAtual < 1000){
                porcentagem = 0.20f;
                salarioLiquido = salarioAtual + (salarioAtual * porcentagem);
                System.out.println("====================================");
                System.out.println("Nome: " + funcionarios.get(i).nome);
                System.out.printf("Salário: %,.2f %n", salarioAtual);
                System.out.printf("Bonus: %,.2f %n", salarioAtual * porcentagem);
                System.out.printf("Salário Liquido: %,.2f %n", salarioLiquido);
                System.out.println("====================================");
            }else if(salarioAtual >= 1000 && salarioAtual < 2000){
                porcentagem = 0.10f;
                salarioLiquido = salarioAtual + (salarioAtual * porcentagem);
                System.out.println("====================================");
                System.out.println("Nome: " + funcionarios.get(i).nome);
                System.out.printf("Salário: %,.2f %n", salarioAtual);
                System.out.printf("Bonus: %,.2f %n", salarioAtual * porcentagem);
                System.out.printf("Salário Liquido: %,.2f %n", salarioLiquido);
                System.out.println("====================================");
            }else{
                porcentagem = 0.10f;
                salarioLiquido = salarioAtual - (salarioAtual * porcentagem);
                System.out.println("====================================");
                System.out.println("Nome: " + funcionarios.get(i).nome);
                System.out.printf("Salário: %,.2f %n", salarioAtual);
                System.out.printf("Desconto: %,.2f %n", salarioAtual * porcentagem);
                System.out.printf("Salário Liquido: %,.2f %n", salarioLiquido);
                System.out.println("====================================");
            }
        }
        return salarioLiquido;
    }
}
