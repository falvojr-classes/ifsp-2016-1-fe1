package br.edu.ifsp.fe1.licao05;

/**
 *
 * @author falvojr
 */
class Secretaria extends Funcionario {

    private String ramal;

    public Secretaria(String nome, double salario) {
        super(nome, salario);
        System.out.println("Secretaria criada!");
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println(this.getRamal());
        System.out.println();
    }
}
