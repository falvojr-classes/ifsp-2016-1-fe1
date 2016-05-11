package br.edu.ifsp.fe1.licao04;

/**
 * 11. Crie as classes Clube e Jogador, elas representarão tais entidades em uma
 * aplicação para controle de finanças de clubes. A classe Clube deve possuir os
 * atributos de instância nome e saldo. A classe Jogador, por sua vez, deve
 * possuir nome, posição, numero, salário, felicidade (atributo do tipo boolean)
 * e clube.
 *
 * @author falvojr
 */
class Jogador {

    private String nome;
    private String posicao;
    private int numero;
    private double salario;
    private boolean felicidade;
    private Clube clube;

    /**
     * 12. Implemente um único construtor na classe Jogador, ele deve garantir
     * que toda instância desse tipo forneça seu respectivo Clube.
     *
     * @param clube
     */
    public Jogador(Clube clube) {
        this.clube = clube;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isFelicidade() {
        return felicidade;
    }

    public void setFelicidade(boolean felicidade) {
        this.felicidade = felicidade;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }

    /**
     * 14. Na classe Jogador, crie um método público chamado recebeSalario. Esse
     * método deve subtrair o salário do jogador do saldo de seu respectivo
     * Clube. Além disso, em um método auxiliar, verifique se o clube possui
     * saldo para realização do pagamento e em caso negativo altere o atributo
     * felicidade para false.
     */
    public void recebeSalario() {
        double saldoCalculado = this.getClube().getSaldo() - this.salario;
        this.verificaSaldoCalculado(saldoCalculado);
    }
    
    private void verificaSaldoCalculado(double saldoCalculado) {
        if (saldoCalculado < 0) {
            this.felicidade = false;
        } else {
            this.getClube().setSaldo(saldoCalculado);
            this.felicidade = true;
        }
    }
}
