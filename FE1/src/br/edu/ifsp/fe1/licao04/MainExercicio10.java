package br.edu.ifsp.fe1.licao04;

/**
 *
 * @author falvojr
 */
public class MainExercicio10 {
    public static void main(String[] args) {   
        // 10 item c:
        Conta conta = new Conta();
        Agencia agencia = new Agencia();
        
        conta.setNumero(1);
        conta.setSaldo(100);
        conta.setAgencia(agencia);
        conta.getAgencia().setNumero(123);
        
        System.out.println(conta.getNumero());        
        System.out.println(conta.getAgencia().getNumero());  
        
        // 10 item f:
        for (int i = 0; i < 1000; i++) {
            Conta contaLaco = new Conta();
            System.out.printf("Conta %d, saldo: R$%.2f\n", Conta.getContador(), 
                    contaLaco.getSaldo());
        }
    }
}
