package curso;

public class controleFluxo2 {
    public static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 '' idade < 18 categoria juvenil
        //idade >= 18 adulto

        int idade = 14;
        String categoria;

        if(idade < 15){
            categoria = "infantil";
        }else {
            categoria = "adulto";
        }
        System.out.println(categoria);
    }
}
