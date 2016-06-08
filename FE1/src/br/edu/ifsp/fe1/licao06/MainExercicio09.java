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
        Funcionario gerente = new Gerente();
        Funcionario telefonista = new Telefonista("Arthur");
        Funcionario seguranca = new Seguranca();
        Funcionario recepcionista = new Recepcionista("Elton");
        
        gerente.setNome("Patricia");
        seguranca.setNome("Suelen");
        
        PontoControle.registrarEntrada(gerente);
        Fe1Util.dormir(1000);
        PontoControle.registrarSaida(gerente);
        
        PontoControle.registrarEntrada(seguranca);
        Fe1Util.dormir(1000);
        PontoControle.registrarSaida(seguranca);
        
        PontoControle.registrarEntrada(telefonista);
        Fe1Util.dormir(1000);
        PontoControle.registrarSaida(telefonista);
        
        PontoControle.registrarEntrada(recepcionista);
        Fe1Util.dormir(1000);
        PontoControle.registrarSaida(recepcionista);
    }
}
