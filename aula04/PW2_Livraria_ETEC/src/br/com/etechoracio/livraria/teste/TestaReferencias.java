package br.com.etechoracio.livraria.teste;

import br.com.etechoracio.livraria.model.Livro;

public class TestaReferencias {
    public static void main(String[] args) {
        Livro livroA = new Livro();
        livroA.setTitulo("Teste de referencia");
        System.out.printf("LivroA titulo: %s\n", livroA.getTitulo());

        Livro livroB = livroA;
        System.out.println(livroB.getTitulo());

        livroB.setTitulo("MACEDONIA x BUCANEIRO");
        System.out.println(livroB.getTitulo());
        System.out.println(livroA);
        System.out.println(livroB);
    }
}
