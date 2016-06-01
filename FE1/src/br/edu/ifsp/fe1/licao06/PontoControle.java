package br.edu.ifsp.fe1.licao06;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 8. Implemente a classe ControlePonto com dois métodos: o primeiro para
 * registrar a entrada de um funcionário e o segundo para registrar a saída.
 * Tais métodos devem imprimir “Entrada” ou “Saída”, nome do funcionário e data
 * atual no formato “dd/MM/yyyy HH:mm:ss”
 *
 * @author falvojr
 */
public class PontoControle {

    public static void registrarEntrada(Funcionario funcionario) {
        System.out.println("ENTRADA");
        PontoControle.registrarES(funcionario);
    }

    public static void registrarSaida(Funcionario funcionario) {
        System.out.println("SAIDA");
        PontoControle.registrarES(funcionario);
    }
    
    private static void registrarES(Funcionario funcionario) {
        System.out.printf("Nome: %s%s", funcionario.getNome(), System.lineSeparator());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.printf("Data: %s%s", sdf.format(new Date()), System.lineSeparator());
    }
    
}
