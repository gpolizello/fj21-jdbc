package br.com.polizello.jdbc.teste;

import br.com.polizello.jdbc.dao.ContatoDao;
import br.com.polizello.jdbc.modelo.Contato;

import java.util.List;

public class TestaLista {

    public static void main(String[] args) {
        ContatoDao dao = new ContatoDao();

        List<Contato> contatos = dao.getLista();

        contatos.forEach(System.out::println);
    }
}
