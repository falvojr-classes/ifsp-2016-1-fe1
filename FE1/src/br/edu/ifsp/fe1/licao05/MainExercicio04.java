package br.edu.ifsp.fe1.licao05;

/**
 * 4. Teste o funcionamento dos três tipos de funcionários criando um objeto de
 * cada uma das classes: Gerente, Telefonista e Secretaria.
 *
 * @author falvojr
 */
class MainExercicio04 {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gerente", 1500);
        Telefonista telefonista = new Telefonista("Telefonista", 800);
        Secretaria secretaria = new Secretaria("Secretaria", 1750);
        
        gerente.setUsuario("gerente.arq");
        gerente.setSenha("123456");

        telefonista.setCodigoEstacaoTrabalho(23);

        secretaria.setRamal("8051");
        
        gerente.imprimirDados();
        telefonista.imprimirDados();
        secretaria.imprimirDados();
    }
}
