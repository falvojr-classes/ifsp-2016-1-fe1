package br.edu.ifsp.fe1.licao02;

/**
 * 18. Teste os métodos da classe Conta.
 * 
 * @author falvojr
 */
public class MainExercicio18 {
    
    public static void main(String[] args) {
        Agencia agencia = new Agencia();
        agencia.numero = 123;
        
        Conta conta = new Conta();
        conta.numero = 1;
        
        conta.agencia = agencia;
        
        conta.deposita(30);
        conta.deposita(30);
        conta.deposita(30);
        conta.saca(90);
        
        System.out.println(conta.saldo);
    }
}
