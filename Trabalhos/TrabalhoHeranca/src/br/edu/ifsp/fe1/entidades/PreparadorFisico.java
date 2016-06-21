package br.edu.ifsp.fe1.entidades;

/**
 * Sub classe que representa o funcionario do tipo Preparador Fisico.
 * 
 * 12. Evolua o seu projeto de modo que exista um novo tipo de funcionário, os
 * preparadores físicos. Nesse sentido, crie a classe PreparadorFisico, que deve
 * possuir os seguintes atributos de instância: nome, salário, especialidade,
 * felicidade e clube. Preparadores físicos em geral recebem o salário como
 * qualquer outro funcionário, exceto no caso de sua especialidade ser
 * “Resistência”, nesse caso o funcionário em questão recebe um acréscimo de 5%.
 *
 * @author falvojr
 */
public class PreparadorFisico extends Funcionario {

    public static final String RESISTENCIA = "Resistência";
    
    private static int contador;
    
    private String especialidade;

    public PreparadorFisico(double salario, Clube clube) {
        super(salario, clube);
        PreparadorFisico.contador++;
    }

    public static int getContador() {
        return PreparadorFisico.contador;
    }
    
    public String getEspecialidade() {
        return this.especialidade;
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void receberSalario() {
        if (RESISTENCIA.equals(this.especialidade)) {
            double salarioPreparador = super.getSalario() * 1.05;
            super.receberSalario(salarioPreparador);
        } else {
            super.receberSalario();
        }
    }

}
