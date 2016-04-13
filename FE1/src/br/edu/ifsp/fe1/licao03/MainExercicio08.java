package br.edu.ifsp.fe1.licao03;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 8. Crie uma nova classe de testes que instâncie um número aleatório de novos
 * clientes (entre 0 e 50). Para isso, crie um método auxiliar para a sua classe
 * de testes e o acione a partir do main, esse método deve retornar um valor
 * aleatório de repetição para a criação dos Clientes. 
 * 
 * + Os Clientes devem possuir os nomes no seguinte formato: “Cliente 1”, 
 *   “Cliente 2” etc; 
 * + Para definir um numero aleatorio dentro de um intervalo utilize o 
 *   seguinte código:
 *
 * @author falvojr
 */
class MainExercicio08 {

    public static void main(String[] args) {
        
        int aleatorio = MainExercicio08.geraAleatorio(0, 50);
        
        for(int i = 1; i <= aleatorio; i++) {
            Cliente cliente = new Cliente("Cliente " + aleatorio);
            System.out.println(cliente.nome);
        }
    }

    static int geraAleatorio(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
