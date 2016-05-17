package br.edu.ifsp.fe1.licao05;

/**
 * 4. Teste o funcionamento dos três tipos de funcionários criando um objeto de
 * cada uma das classes: Gerente, Telefonista e Secretaria.
 *
 * @author falvojr
 */
class MainExercicio04 {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Telefonista telefonista = new Telefonista();
        Secretaria secretaria = new Secretaria();
        
        gerente.setNome("Gerente");
        gerente.setSalario(1500);
        gerente.setUsuario("gerente.arq");
        gerente.setSenha("123456");
        
        telefonista.setNome("Telefonista");
        telefonista.setSalario(800);
        telefonista.setCodigoEstacaoTrabalho(23);
        
        secretaria.setNome("Secretaria");
        secretaria.setSalario(1750);
        secretaria.setRamal("8051");
        
        gerente.imprimirDados();
        telefonista.imprimirDados();
        secretaria.imprimirDados();
    }
}
