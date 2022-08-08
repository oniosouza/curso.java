package aulas;

public class controleFluxo_do_while {
    public static void main(String[] args) {

        int contador = 1;
        while (contador < 10) {
            System.out.println(++contador);

        }
        /*aqui, independente da condicao ser true ou false.
        ele execulta pelo menos uma vez
         */
        do {
            System.out.println("ocorreu o do while");
        } while (contador < 10);
    }

}
