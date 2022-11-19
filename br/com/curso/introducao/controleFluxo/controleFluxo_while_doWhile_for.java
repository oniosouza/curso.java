package br.com.curso.introducao.controleFluxo;

public class controleFluxo_while_doWhile_for {
    public static void main(String[] args) {
        /*O while e do while, se utiliza quando nao se tem a certeza
        de quantas vezes será necessaria a iteracao ou repeticao do codigo.

        Enquanto o for voce tem o tamanha pre definido, voce ja sabe
        quantas vezes esse bloco de codigo pode ser execultado.
         */
        int contador = 11;
        while (contador < 10) {
            System.out.println(++contador);
        }
        do {
            System.out.println("dentro do, Do While");
        } while (contador < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("valor de i é: " + i);
            /*Para parar a execucao no meio do codigo, utiliza-se
            a fincao a baixo:
            if(i==5){
               break;
              }
              nesse caso o codigo contaria ate 5.
             */
        }
    }
}
