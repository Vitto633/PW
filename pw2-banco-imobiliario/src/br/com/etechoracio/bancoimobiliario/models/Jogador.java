package br.com.etechoracio.bancoimobiliario.models;

public class Jogador {
    private String nome;
    private double saldo;

    public Jogador(String nome) {
        this.setNome(nome);
    }

    public Jogador(String nome, double saldo) {
        this.setSaldo(saldo);
        this.setNome(nome);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void debitar(double valor) {
        this.setSaldo(this.getSaldo() - valor);
    }

    public void creditar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public void alugar(Jogador jogador, double valor) {
        this.creditar(valor);
        jogador.debitar(valor);
    }

    public void jogar(String operacao, double valor) {
        if (operacao.equalsIgnoreCase("C")) {
            debitar(valor);
        } else if (operacao.equalsIgnoreCase("V")) {
            creditar(valor);
        }
    }

    public void jogar(String operacao, double valor, Jogador jogador){
        if (operacao.equalsIgnoreCase("A")){
            alugar(jogador, valor);
        }
        else{
            jogar(operacao, valor);
        }
    }
}
