package br.edu.ifsp.fe1.t2;

/**
 * Super classe Pessoa.
 *
 * @author falvojr
 */
public abstract class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome) {
        this.nome = nome;
    } 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public abstract boolean validarDocumento();
    
    public void imprimirDadosPessoais() {
        System.out.printf("Nome:%s%s", this.nome, System.lineSeparator());
        System.out.printf("Endereco:%s%s", this.endereco, System.lineSeparator());
        System.out.printf("Telefone:%s%s", this.telefone, System.lineSeparator());
    }
    
    protected boolean validarDocumento(String documento, int tamanho) {
        boolean ehValido = true;
        if (documento == null || documento.length() != tamanho) {
            ehValido = false;
        }
        return ehValido;
    }
}
