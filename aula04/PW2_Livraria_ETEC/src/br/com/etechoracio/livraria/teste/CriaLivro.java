package br.com.etechoracio.livraria.teste;

import br.com.etechoracio.livraria.model.Kindle;
import br.com.etechoracio.livraria.model.Livro;

public class CriaLivro {
    public static void main(String[] args) {



        Livro primeiroLivro = new Livro();
        primeiroLivro.setTitulo("hari pote");https://www.monkeytype.com
        primeiroLivro.setPreco(30.00f);
        primeiroLivro.setResumo("O harry potter quase morreu pro menino sem nazria ai o harry potter creasceu e tento mata o menino sem nariz");
        primeiroLivro.setPaginas(100);
        primeiroLivro.getEditoraLivro().setSite("www.pitoco.com.br");
        primeiroLivro.getEditoraLivro().setNomeEditora("pitoco");
        primeiroLivro.setDesconto(0.15);
        primeiroLivro.status();


        br.com.etechoracio.livraria.model.Livro segundoLivro = new br.com.etechoracio.livraria.model.Livro();
        segundoLivro.setTitulo("roblox");
        segundoLivro.setAutor("david bazuca");
        segundoLivro.getEditoraLivro().setNomeEditora("roblox company");
        segundoLivro.getEditoraLivro().setSite("www.trojan.com");
        segundoLivro.setPreco(100.00f);
        segundoLivro.setResumo("###### o roblox");
        segundoLivro.setPaginas(30);
        segundoLivro.status();

        Kindle terceirolivro = new Kindle();
        terceirolivro.setTitulo("Bucas");
        terceirolivro.setAutor("Vitor");
        terceirolivro.getEditoraLivro().setNomeEditora("Eu");
        terceirolivro.setPreco(20.0f);
        terceirolivro.setResumo("Bucaneiro resumo lalalal");



    }


}

//26/03 Encapsulamento - Projeto
//02/04 Atividade Avaliativa
//09/04 Herança - Polimorfismo - Projeto
//16/04 Classe abstrata
