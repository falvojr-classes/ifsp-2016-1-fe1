package br.edu.ifsp.fe1.t2;

/**
 * Subclasse PessoaJuridica.
 *
 * @author falvojr
 */
public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String dataAbertura;

    private static int contadorFalhas;
    
    public PessoaJuridica(String nome) {
        super(nome);
    }

    public PessoaJuridica(String nome, String cnpj) {
         this(nome);
         this.cnpj = cnpj;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    @Override
    public boolean validarDocumento() {
        boolean ehValido = super.validarDocumento(this.cnpj, 14);
        if (ehValido == false) {
            PessoaJuridica.contadorFalhas++;
        }
        return ehValido;
    }
    
    public static int getContadorFalhas() {
        return PessoaJuridica.contadorFalhas;
    }
}
