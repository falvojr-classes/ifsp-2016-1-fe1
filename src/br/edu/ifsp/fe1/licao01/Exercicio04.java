package br.edu.ifsp.fe1.licao01;

/**
 * 6. Para sabermos quanto vamos pagar pela conta de energia elétrica,
 * multiplicamos a potência do eletrodoméstico (watts) pelo número médio de
 * horas que o mesmo permanece ligado por dia. Sabendo-se que o quilowatt-hora
 * (kwh) custa R$ 0,39, faça um programa em linguagem C que receba a potência do
 * eletrodoméstico (watts), o tempo que ele fica ligado por dia (horas), calcule
 * e mostre: a. Quantos kwh o eletrodoméstico gasta num mês; b. O valor, em
 * reais, a ser pago num mês com desconto de 15%; c. Quantos kwh o
 * eletrodoméstico gasta num ano.
 *
 * @author falvojr
 */
public class Exercicio04 {

    /**
     * Método main.
     *
     * @param args argumentos necessários: Potência e a Horas ao Dia.
     */
    public static void main(String[] args) {
        float potenciaW, potenciaKw, qtdHorasDia, kwhMes, valorMes, kwhAno;

        potenciaW = Float.parseFloat(args[0]);
        qtdHorasDia = Float.parseFloat(args[1]);

        potenciaKw = potenciaW / 1000;
        kwhMes = potenciaKw * qtdHorasDia * 30;
        valorMes = kwhMes * 0.39F * 0.85F;
        kwhAno = potenciaKw * qtdHorasDia * 365;

        String saidaKwhMes = String.format("KWH Mes: %.2f", kwhMes);
        String saidaValorMes = String.format("Valor Mes (com 15 porcento de desconto): %.2f", valorMes);
        String saidaKwhAno = String.format("KWH Ano: %.2f", kwhAno);

        System.out.println(saidaKwhMes);
        System.out.println(saidaValorMes);
        System.out.println(saidaKwhAno);
    }

}
