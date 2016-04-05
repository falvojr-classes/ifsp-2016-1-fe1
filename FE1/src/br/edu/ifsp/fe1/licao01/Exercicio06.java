package br.edu.ifsp.fe1.licao01;

/**
 * 6. Faça um programa que leia o valor de um sensor de temperatura TM35, que
 * varia de 0 a 1023, onde 0 corresponde a 0 Volts e 1023 corresponde a 5 Volts.
 * Além disso, sabemos que 1ºC é igual a 10mV. Com isso, podemos considerar a
 * seguinte equação: 
 * 
 * Temperatura em ºC = (TM35 * (5V/1023)) / 10mV
 *
 * @author falvojr
 */
public class Exercicio06 {

    /**
     * Método main.
     *
     * @param args argumentos necessários: Valor de Leitura do Sensor TM35.
     */
    public static void main(String[] args) {
        int sensorTM35;
        double temperaturaCelsius;

        sensorTM35 = Integer.parseInt(args[0]);

        temperaturaCelsius = (sensorTM35 * (5.0/1023)) / 0.01;
        
        String saida = String.format("Temperatura em Celsius: %.2f", temperaturaCelsius);   
        System.out.println(saida);
    }

}
