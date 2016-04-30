package br.edu.ifsp.fe1.licao03;

/**
 * 10. Crie uma classe chamada Funcionario e defina dois atributos de instância
 * (nome e salário) e um atributo de classe (vale refeição diário, com valor
 * inicial igual a 15).
 *
 * 11. Defina dois métodos de instância que aumentem o salário de um
 * funcionario, um deve aplicar uma porcentagem variável e outro um porcentagem
 * constante de 10%. Além disso, implemente um terceiro método de instância que
 * retorne o salário bruto do Funcionário, considerando uma quantidade de dias
 * trabalhados para calcular o montante recebido com o vale refeicao.
 *
 * @author falvojr
 */
class Funcionario {

    String nome;
    double salario;
    static double valeRefeicaoDiario = 15;

    /**
     * 13. Defina um método de classe para reajustar o vale refeição diário a
     * partir de uma taxa.
     *
     * @param taxa
     */
    static void ajustaValeRefeicaoDiario(double taxa) {
        Funcionario.valeRefeicaoDiario *= taxa;
    }

    void aumentaSalario(double porcentagem) {
        this.salario *= porcentagem;
    }

    void aumentaSalario() {
        this.aumentaSalario(1.10);
    }

    double recuperaSalarioBruto(int diasTrabalhados) {
        double valeRefeicao = diasTrabalhados * Funcionario.valeRefeicaoDiario;
        return this.salario + valeRefeicao;
    }

}
