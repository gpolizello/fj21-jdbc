package br.com.polizello.jdbc.teste;

import br.com.polizello.jdbc.dao.ContatoDao;
import br.com.polizello.jdbc.modelo.Contato;

import java.util.Calendar;

public class TestaInsere {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Gabriel");
        contato.setEmail("gpolizello@hotmail.com");
        contato.setEndereco("Rua Alberto Santos Dumont 53");
        contato.setDataNascimento(Calendar.getInstance());

        ContatoDao dao = new ContatoDao();

        dao.adiciona(contato);

        System.out.println("Gravado!");
    }
}
