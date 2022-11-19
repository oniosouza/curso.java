package br.com.curso.introducao.exercicios;

public class Exercico_switch {
    public static void main(String[] args) {
        /*Crie um Switch que dado um valor de 1 a 7
        Considerando 1 Domingo, Imprima se é dia útil ou final de semana.
         */
        byte dia = 9;
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 7:
                System.out.println("fds");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia útil");
                break;
            default:
                System.out.println("================");
                System.out.println("comando inválido");
                System.out.println("================");
        }
    }
}
