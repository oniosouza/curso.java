package aulas;

public class Exercicio3ControleFluxoIf_Else_If {
    public static void main(String[] args) {

        /*
        Crie uma variavel e imprima seu imposto:
        salario < 1000 5%
        salario >= 1000 && salario < 2000 10%
        salario >= 2000 && salario < 4000 15%
        salrio > 5000 20%
         */

        double salario = 3500;
        double TotalImposto = 0;
        if (salario < 1000) {
            TotalImposto = salario * 0.05;

        } else if (salario >= 1000 && salario < 2000) {
            TotalImposto = salario * 0.1;
        } else if (salario >= 2000 && salario < 4000) {
            TotalImposto = salario * 0.15;
        } else {
            TotalImposto = salario * 2.0;
        }
        System.out.println("O Total de Impostos É:" + TotalImposto);

    }
}
