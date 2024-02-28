public class OrdemServico {
    private int registro;
    private Aparelho infAparelho;
    private Tecnico infTecnico;
    private boolean manutencao;
    private double valorManutencao;
    private boolean pagou;

    public OrdemServico(String nomeDono, String email, String tipo, String problema, String nomeTecnico, int registro, boolean feito, double valorServico, boolean pagamento) {
        this.setRegistro(registro);
        this.infAparelho = new Aparelho(tipo, problema, nomeDono, email);
        this.infTecnico = new Tecnico(nomeTecnico);
        this.manutencao = feito;
        this.valorManutencao = new Tecnico(nomeTecnico).custearServico(valorServico);
        this.pagou = new Aparelho(tipo, problema, nomeDono, email).getDono().realizarPagamento(pagamento);
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public Aparelho getInfAparelho() {
        return infAparelho;
    }

    public void setInfAparelho(Aparelho infAparelho) {
        this.infAparelho = infAparelho;
    }

    public Tecnico getInfTecnico() {
        return infTecnico;
    }

    public void setInfTecnico(Tecnico infTecnico) {
        this.infTecnico = infTecnico;
    }

    public boolean isManutencao() {
        return manutencao;
    }

    public void setManutencao(boolean manutencao) {
        this.manutencao = manutencao;
    }

    public double getValorManutencao() {
        return valorManutencao;
    }

    public void setValorManutencao(double valorManutencao) {
        this.valorManutencao = valorManutencao;
    }

    public boolean isPagou() {
        return pagou;
    }

    public void setPagou(boolean pagou) {
        this.pagou = pagou;
    }

    public void mostraInformacoes() {
        System.out.println("Nome do Cliente:  " + this.infAparelho.getDono().getNome());
        System.out.println("Email: " + this.infAparelho.getDono().getEmail());
        System.out.println("Tipo do aparelho: " + this.infAparelho.getTipo());
        System.out.println("Problema: " + this.infAparelho.getProblema());
        System.out.println("Técnico responsável: " + this.infTecnico.getNome());
        System.out.println("Registro: " + this.registro);
        System.out.println("Manutencao: " + this.manutencao);
        System.out.println("Valor da manutencao: R$ " + String.format("%.2f", this.valorManutencao));
        NotaFiscal nota = new NotaFiscal(this.valorManutencao);
        nota.verificaPagamento(this.pagou);
    }
}
