package br.edu.ifsp.fe1.licao02;

/**
 * 18. Teste os métodos da classe Conta.
 * 
 * @author falvojr
 */
public class MainExercicio18 {
    
    public static void main(String[] args) {
        Agencia agencia = new Agencia(123);
        
        Conta conta = new Conta(agencia);
        conta.numero = 1;
        
        conta.deposita(30);
        conta.deposita(30);
        conta.deposita(30);
        conta.deposita(30);
        conta.deposita(30);
        
        conta.imprimeExtrato();
        
        double valorSaque = conta.consultaSaldoDisponivel();
        conta.saca(valorSaque);
        
        conta.imprimeExtrato();
    }
}
