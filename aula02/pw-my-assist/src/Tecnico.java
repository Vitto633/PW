public class Tecnico {
    private String nome;

    public Tecnico(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean realizarManutencao(boolean feito) {
        return feito;
    }

    public double custearServico(double preco) {
        return preco;
    }
}
