package br.edu.ifsp.fe1.licao06;

/**
 * Super classe para entidades do tipo Animal.
 *
 * @author falvojr
 */
public abstract class Animal {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public abstract void emitirSom();
}
