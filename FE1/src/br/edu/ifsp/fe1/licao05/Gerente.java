package br.edu.ifsp.fe1.licao05;

class Gerente extends Funcionario {

    private String usuario;
    private String senha;

    public Gerente(String nome, double salario) {
        super(nome, salario);
        System.out.println("Gerente criado!");
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

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println(this.getUsuario());
        System.out.println(this.getSenha());
        System.out.println();
    }

    /**
     * 7. Suponha que os gerentes recebam uma bonificação maior que os outros
     * funcionários, 15% do salário. Reescreva o método calculaBonificacao() na
     * classe Gerente. Depois, compile e execute o teste novamente.
     *
     * @return
     */
    @Override
    public double calculaBonificacao() {
        return super.getSalario() * 0.15;
    }

}
