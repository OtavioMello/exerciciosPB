package br.com.aula.compasso;

import java.util.ArrayList;
import java.util.Objects;

public class Usuario {

    String nome;
    String senha;
    private static ArrayList<Usuario> contas = new ArrayList<Usuario>();

    //Construtor de Usuários.
    Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    //Método para adicionar contas no ArrayList contas.
    static void geraListaUsuario(){
        contas.add(new Usuario("Usuario1", "1"));
        contas.add(new Usuario("Usuario2", "2"));
        contas.add(new Usuario("Usuario3", "3"));
        contas.add(new Usuario("Usuario4", "4"));
        contas.add(new Usuario("Usuario5", "5"));
        contas.add(new Usuario("Usuario6", "6"));
    }

    //Método que irá validar se o login informado pelo usuário pertence ao ArrayList de contas.
    static boolean validaConta(String inputNome, String inputSenha){

        boolean contaValida = false;

        //for que irá percorrer o ArrayList e comparar se o nome e senha no index atual são iguais aos inputs do usuário.
        for (int i = 0; i < contas.size(); i++) {

            //if retornará true se a conta exixtir.
            if (contas.get(i).nome.equals(inputNome) && contas.get(i).senha.equals(inputSenha)){
                contaValida = !contaValida;
                break;
            }
        }

        //Ou falso caso não exista.
        return contaValida;
    }

}
