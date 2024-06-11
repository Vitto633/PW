package br.com.etechoracio.bancoimobiliario.teste;

import br.com.etechoracio.bancoimobiliario.models.Jogador;

import java.util.ArrayList;
import java.util.List;

public class testaJogo {
    public static void main(String[] args) {
        List<Jogador> jogadores =new ArrayList<>();
        jogadores.add(new Jogador("Rogerio Tech", 10000));
        jogadores.add(new Jogador("Marion Codes", 10000));
        jogadores.add(new Jogador("Edson Ti", 10000));

        String sigla = "M";
        String operacao = "C";
        double valor = 5000;

        Jogador jogador = jogadores.stream().filter(elemento -> elemento.getNome().startsWith(sigla)).findFirst().orElseThrow();

        jogador.jogar(operacao, valor);

         sigla = "M";
         operacao = "C";
         valor = 5000;

         jogador = jogadores.stream().filter(elemento -> elemento.getNome().startsWith(sigla)).findFirst().orElseThrow();

        jogador.jogar(operacao, valor);
    }
}
