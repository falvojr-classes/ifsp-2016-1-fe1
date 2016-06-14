package br.edu.ifsp.fe1.t2;

/**
 * Subclasse PessoaFisica.
 *
 * @author falvojr
 */
public class PessoaFisica extends Pessoa {

    private String cpf;
    private String dataNascimento;
    
    public PessoaFisica(String nome) {
         super(nome);
    }
    
    public PessoaFisica(String nome, String cpf) {
         this(nome);
         this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public boolean validarDocumento() {
        boolean ehValido = super.validarDocumento(this.cpf, 11);
        return ehValido;
    }
}
