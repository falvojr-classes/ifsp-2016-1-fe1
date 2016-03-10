package br.edu.ifsp.fe1.licao01;

/**
 * 3. Escreva um programa que faça a leitura de dois números inteiros e retorne
 * o produto destes dois números.
 *
 * @author falvojr
 */
public class Exercicio03 {

    /**
     * Método main.
     *
     * @param args argumentos necessários: Número 1 e Número 2.
     */
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(args[0]);
        int numero2 = Integer.parseInt(args[1]);
        int total = numero1 * numero2;
        
        String saida = String.format("%d * %d = %d", numero1, numero2, total);
        System.out.println(saida);
    }
}
