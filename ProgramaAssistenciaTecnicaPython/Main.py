import OrdemServico
from OrdemServico import *

clientes = ["vitor", "jacob", "pinter", "pssergio", "lucasDoido", "erasmitico"]
emails = ["vitor@gmail.com", "beanos@hotmail.com", "matheus@gmail.com", "PsSergio@gmail.com","doidao@gmail.com", "tksBalaTensa@gmail.com"]
tpAparelho = ["computador", "bucaneiro", "celular", "desktop", "doidomovel", "tablet"]
problemas = ["não carrega", "não sai som", "botão de ligar quebrado ", "camera não funfa", "tela trincada", "deu pt"]
tecnico = "guigui"
registro = 235
manutencoes = ["foi realizada a troca de bateria", "foi realizada a troca de auto falante", "foi realizada a troca do botão liga/desliga ", "foi realizada a troca da camera", "foi ralizada a troca da tela", "fiz magia slk"]
pagou = [1, 0 ,0, 1, 0 ,1]
valores = [90.00, 45.00, 25.00, 30.00, 95.00, 20.00]

for i in range(len(clientes)):
    print("ORDEM DE SERVIÇO", 1 + i)
    print("-"*30)
    ordem = OrdemServico(clientes[i], emails[i], tpAparelho[i], problemas[i],tecnico, registro + i , manutencoes[i], valores[i], pagou[i])
    ordem.mostraInformacoes()
