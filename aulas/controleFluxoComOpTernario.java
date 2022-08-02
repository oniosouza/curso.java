package Aulas;

public class controleFluxoComOpTernario {
    public static void main(String[] args) {
        int idade = 17;
        String status;
        if (idade < 18) {
            status = "nao adulto";
        } else {
            status = "adulto";
        }
        status = idade < 18 ? "nao adulto" : "adulto";
        System.out.println(status);
    }
}
