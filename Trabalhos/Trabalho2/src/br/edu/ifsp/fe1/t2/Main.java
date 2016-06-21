package br.edu.ifsp.fe1.t2;

/**
 * Classe de testes.
 *
 * @author falvojr
 */
public class Main {

    public static void main(String[] args) {
        Pessoa pf1 = new PessoaFisica("Venilton 1", "11111111111");
        PessoaFisica pf2 = new PessoaFisica("Venilton 2");
        Pessoa pj1 = new PessoaJuridica("IFSP 1", "1111111111111");
        PessoaJuridica pj2 = new PessoaJuridica("IFSP 2");
        
        pf1.setEndereco("Rua dos Testes, 1234");
        pf1.setTelefone("16 99999-9999");
        
        pf2.setCpf("222222222222");
        
        pf1.imprimirDadosPessoais();
        pf2.imprimirDadosPessoais();
        pj1.imprimirDadosPessoais();
        pj2.imprimirDadosPessoais();
        System.out.println();
        
        String quebraLinha = System.lineSeparator();
      
        boolean ehValido = pf1.validarDocumento();  
        System.out.printf("%s: Doc %b%s", pf1.getNome(), ehValido, quebraLinha); 
        ehValido = pf2.validarDocumento();
        System.out.printf("%s: Doc %b%s", pf2.getNome(), ehValido, quebraLinha);
        ehValido = pj1.validarDocumento();
        System.out.printf("%s: Doc %b%s", pj1.getNome(), ehValido, quebraLinha);
        ehValido = pj2.validarDocumento();
        System.out.printf("%s: Doc %b%s", pj2.getNome(), ehValido, quebraLinha);
        System.out.println();
        
        int qtdFalhasPj = PessoaJuridica.getContadorFalhas();
        System.out.println("Falhas PJ: " + qtdFalhasPj);
    }
}
