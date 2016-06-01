package br.edu.ifsp.fe1.licao06;

/**
 * 7. Implemente duas classes específicas para modelar dois tipos particulares
 * de funcionários do banco: Gerente (possui os atributos usuario e senha) e
 * Telefonista (possui um código numérico para sua estação de trabalho).
 *
 * @author falvojr
 */
public class Gerente extends Funcionario {

    private String usuario;
    private String senha;

    public Gerente() {
        super();
    }

    public Gerente(String nome) {
        super(nome);
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
