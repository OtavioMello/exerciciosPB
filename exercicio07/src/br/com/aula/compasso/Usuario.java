package br.com.aula.compasso;

import java.util.ArrayList;
import java.util.Objects;

public class Usuario {

    String nome;
    String senha;
    private static ArrayList<Usuario> contas = new ArrayList<Usuario>();

    Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    static void geraListaUsuario(){
        contas.add(new Usuario("Usuario1", "1"));
        contas.add(new Usuario("Usuario2", "2"));
        contas.add(new Usuario("Usuario3", "3"));
        contas.add(new Usuario("Usuario4", "4"));
        contas.add(new Usuario("Usuario5", "5"));
        contas.add(new Usuario("Usuario6", "6"));
    }

    static boolean validaConta(String inputNome, String inputSenha){

        boolean contaValida = false;



        for (int i = 0; i < contas.size(); i++) {

            if (contas.get(i).nome.equals(inputNome) && contas.get(i).senha.equals(inputSenha)){
                contaValida = !contaValida;
                break;
            }
        }
        return contaValida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome) && Objects.equals(senha, usuario.senha);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
