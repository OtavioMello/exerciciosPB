package br.com.aula.compasso;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sistema {

    private static Date horaAtual;

    //Método responsável por verificar o horário do sistema e exibir a mensagem adequada
    // ***(não foi testado em todos os horários :( )***
    static void verificatempo(String inputNome){

        horaAtual = new Date();
        int horaAtualFormatada = Integer.parseInt(new SimpleDateFormat("HH").format(horaAtual));

        if(horaAtualFormatada >= 6 && horaAtualFormatada < 12){
            System.out.println("Bom dia " + inputNome + ", você se logou ao nosso sistema!");
        } else if(horaAtualFormatada >= 12 && horaAtualFormatada < 18){
            System.out.println("Boa tarde " + inputNome + ", você se logou ao nosso sistema!");
        } else if(horaAtualFormatada >= 18 && horaAtualFormatada <= 23){
            System.out.println("Boa noite " + inputNome + ", você se logou ao nosso sistema!");
        } else if(horaAtualFormatada >= 0 && horaAtualFormatada < 6){
            System.out.println("Boa madrugada " + inputNome + ", você se logou ao nosso sistema!");
        }

    }


}
