package br.edu.ifsp.fe1.licao06;

import br.edu.ifsp.fe1.util.Fe1Util;

/**
 * 9. Teste a lógica do controle de ponto, registrando a entrada e a saída de um
 * gerente e de uma telefonista.
 *
 * @author falvojr
 */
public class MainExercicio09 {

    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();
        Gerente gerente2 = new Gerente("Arthur");
        Telefonista telefonista1 = new Telefonista();
        Telefonista telefonista2 = new Telefonista("Elton");
        
        gerente1.setNome("Patricia");
        telefonista1.setNome("Suelen");
        
        PontoControle.registrarEntrada(gerente1);
        Fe1Util.dormir(1000);
        PontoControle.registrarSaida(gerente1);
        
        PontoControle.registrarEntrada(telefonista1);
        Fe1Util.dormir(1000);
        PontoControle.registrarSaida(telefonista1);
        
        PontoControle.registrarEntrada(gerente2);
        Fe1Util.dormir(1000);
        PontoControle.registrarSaida(gerente2);
        
        PontoControle.registrarEntrada(telefonista2);
        Fe1Util.dormir(1000);
        PontoControle.registrarSaida(telefonista2);
    }
}
