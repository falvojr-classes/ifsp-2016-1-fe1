package br.edu.ifsp.fe1.p2;

/**
 *
 * @author falvojr
 */
public abstract class Veiculo {

    private String modelo;
    private String cor;
    private double valor;
    private int ano;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    protected abstract double getPorcentagemIPVA();

    public double calcularIPVA() {
        double retorno = 0;
        if ((2016 - this.getAno()) <= 15) {
            double porcentagem = this.getPorcentagemIPVA();
            retorno = this.getValor() * (porcentagem / 100);
        }
        return retorno;
    }

}
