public class NotaFiscal {
    private double valorManutencao;

    public NotaFiscal(double valorManutencao) {
        this.valorManutencao = valorManutencao;
    }

    public double getValorManutencao() {
        return valorManutencao;
    }

    public void setValorManutencao(double valorManutencao) {
        this.valorManutencao = valorManutencao;
    }

    public void exibeNota() {
        System.out.println("+---------------+");
        System.out.println("| NOTA FISCAL   |");
        System.out.println("|      PAGO     |");
        System.out.println("+---------------+");
    }

    public void verificaPagamento(boolean valorPago) {
        if (valorPago) {
            System.out.println("\n Situação: Pago");
        } else {
            System.out.println("\n Situação: não pago");
        }
    }
}
