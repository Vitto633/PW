public class Main {
    public static void main(String[] args) {
        String[] clientes = {"vitor", "jacob", "pinter", "pssergio", "lucasDoido", "erasmitico"};
        String[] emails = {"vitor@gmail.com", "beanos@hotmail.com", "matheus@gmail.com", "PsSergio@gmail.com", "doidao@gmail.com", "tksBalaTensa@gmail.com"};
        String[] tpAparelho = {"computador", "bucaneiro", "celular", "desktop", "doidomovel", "tablet"};
        String[] problemas = {"não carrega", "não sai som", "botão de ligar quebrado ", "camera não funfa", "tela trincada", "deu pt"};
        String tecnico = "guigui";
        int registro = 235;
        String[] manutencoes = {"foi realizada a troca de bateria", "foi realizada a troca de auto falante", "foi realizada a troca do botão liga/desliga ", "foi realizada a troca da camera", "foi ralizada a troca da tela", "fiz magia slk"};
        boolean[] pagou = {true, false, false, true, false, true};
        double[] valores = {90.00, 45.00, 25.00, 30.00, 95.00, 20.00};

        for (int i = 0; i < clientes.length; i++) {
            System.out.println("ORDEM DE SERVIÇO " + (i + 1));
            System.out.println("----------------------");
            OrdemServico ordem = new OrdemServico(clientes[i], emails[i], tpAparelho[i], problemas[i], tecnico, registro + i, pagou[i], valores[i], pagou[i]);
            ordem.mostraInformacoes();
        }
    }
}
