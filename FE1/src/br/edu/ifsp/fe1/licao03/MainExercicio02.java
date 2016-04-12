package br.edu.ifsp.fe1.licao03;

/**
 * 2. Faça um teste criando dois objetos da classe Conta. Imprima o valor do
 * contador de contas antes e depois da criação de cada objeto.
 * 
 * 4. Altere o teste para imprimir o número de cada conta criada.
 * 
 * 6. Altere o teste para utilizar o método zeraContador().
 * 
 * @author falvojr
 */
class MainExercicio02 {
    
    public static void main(String[] args) {
        
        for(int i = 0; i < 10; i++) {
            Conta conta = new Conta();
            System.out.println(conta.numero);
        }
        
        Conta.zeraContador();
        System.out.println();
        
        for(int i = 0; i < 20; i++) {
            Conta conta = new Conta();
            System.out.println(conta.numero);
        }
    }
}
