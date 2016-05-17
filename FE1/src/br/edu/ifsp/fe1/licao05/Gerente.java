package br.edu.ifsp.fe1.licao05;

class Gerente extends Funcionario {
    private String usuario;
    private String senha;

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
}
