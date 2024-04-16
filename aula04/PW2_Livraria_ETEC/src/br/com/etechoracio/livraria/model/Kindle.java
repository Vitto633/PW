package br.com.etechoracio.livraria.model;

public class Kindle extends Livro{
    private String marcaDAgua;
    
    public Kindle() { 
        super();
    }

    @Override
    public double aplicarDesconto(double preco, double desconto) {
        return super.aplicarDesconto(preco, desconto);
    }
}
