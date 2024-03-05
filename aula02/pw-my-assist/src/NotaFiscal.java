public class NotaFiscal {
    public float valorDaManutencao;

    public void exibeNota(){
        System.out.println("+----------------+");
        System.out.println("| NOTA FISCAL |");
        System.out.println("|               PAGO|");
        System.out.println("+----------------+");
    }

    public void verificaPagamento(float valorPago){
        if(boolean(valorPago) == true){
            System.out.println("Situacao: pago");
        }
        else{
            System.out.println("Situacao: nao pago");
        }
    }

}
