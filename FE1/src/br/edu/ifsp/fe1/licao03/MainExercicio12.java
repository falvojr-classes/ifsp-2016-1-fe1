package br.edu.ifsp.fe1.licao03;

/**
 * 12. Faça uma nova classe de teste para verificar o funcionamento da classe
 * Funcionario. Para isso, crie 2 objetos, defina valores para seus atributos,
 * invoque seus métodos de instância e depure cada etapa de execução, garantindo
 * que o comportamento esperado esteja sendo realizado.
 *
 * 14. Faça um teste para verificar o funcionamento do reajuste do vale
 * refeição.
 *
 * @author falvojr
 */
class MainExercicio12 {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        f1.nome = "Funcionario 1";
        f1.salario = 1000;

        f2.nome = "Funcionario 2";
        f2.salario = 2000;

        f1.aumentaSalario(1.25);
        f2.aumentaSalario();

        double salarioBruto1 = f1.recuperaSalarioBruto(22);
        System.out.println(salarioBruto1);

        Funcionario.ajustaValeRefeicaoDiario(2);

        salarioBruto1 = f1.recuperaSalarioBruto(22);
        System.out.println(salarioBruto1);

        double salarioBruto2 = f2.recuperaSalarioBruto(19);
        System.out.println(salarioBruto2);
    }
}
