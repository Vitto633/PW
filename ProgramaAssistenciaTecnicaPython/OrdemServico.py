from Tecnico import *
from NotaFiscal import *
from Aparelho import *

class OrdemServico:
    def __init__(self, nomeDono, email, tipo, problema, nomeTecnico, registro, feito, valorServico, pagamento):
        self.registro = registro
        self.infAparelho = Aparelho(tipo, problema, nomeDono, email)
        self.infTecnico = Tecnico(nomeTecnico)
        self.manutencao = Tecnico(nomeTecnico).realizarManutencao(feito)
        self.valorManutencao = Tecnico(nomeTecnico).custearServico(valorServico)
        self.pagou = Aparelho(tipo, problema, nomeDono, email).dono.realizarPagamento(pagamento)

    def mostraInformacoes(self):
        print(f"Nome do Cliente:  {self.infAparelho.dono.nome}")
        print(f"Email: {self.infAparelho.dono.email}")
        print(f"Tipo do aparelho: {self.infAparelho.tipo}")
        print(f"Problema: {self.infAparelho.problema}")
        print(f"Técnico responsável: {self.infTecnico.nome} ")
        print(f"Registro: {self.registro}")
        print(f"Manutencao: {self.manutencao}")
        print(f"Valor da manutencao: R$ {self.valorManutencao:,.2f}")
        nota = NotaFiscal(self.valorManutencao)
        nota.verificaPagamento(self.pagou)
