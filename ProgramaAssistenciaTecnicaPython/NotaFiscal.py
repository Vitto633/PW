class NotaFiscal:
    def __init__(self, valorManutencao):
        self.valorManutencao = valorManutencao

    def exibeNota(self):
        print("+", "-" *15, "+")
        print("| NOTA FISCAL |")
        print("|           PAGO|")
        print("+", "-" * 15, "+")

    def verificaPagamento(self, valorPago):
        if bool(valorPago):
            print("\n Situação: Pago")
        else:
            print("\n Situação: não pago")

