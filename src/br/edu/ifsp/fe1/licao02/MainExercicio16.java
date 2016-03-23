package br.edu.ifsp.fe1.licao02;

/**
 * Suponha que Luís Carlos se dirija a Agência 825 de seu banco, com o objetivo
 * de abrir 3 novas Contas Corrente. Ao final do dia, as novas contas foram
 * definidas da seguinte forma:
 *
 * @author falvojr
 */
class MainExercicio16 {

    public static void main(String[] args) {
        // Objeto que representa a Agencia 825:
        Agencia agencia825 = new Agencia();
        agencia825.numero = 825;
        
        // Objeto que representa a Conta 1:
        Conta contaEsposo = new Conta();
        contaEsposo.numero = 1;
        contaEsposo.limite = 3000;
        
        // Objeto que representa a Conta 2:
        Conta contaEsposa = new Conta();
        contaEsposa.numero = 2;
        contaEsposa.limite = 1500;
        
        // Objeto que representa a Conta 3:
        Conta contaFilho = new Conta();
        contaFilho.numero = 3;
        
        // Relaciona as Contas a Agencia 825:
        contaEsposo.agencia = agencia825;
        contaEsposa.agencia = agencia825;
        contaFilho.agencia = agencia825;
        
        // "Prova" que todas as ag^encias 
        System.out.println(contaEsposo.agencia);
        System.out.println(contaEsposa.agencia);
        System.out.println(contaFilho.agencia);
    }

}
