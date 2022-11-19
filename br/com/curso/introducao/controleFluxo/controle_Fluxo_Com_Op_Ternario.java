package br.com.curso.introducao.controleFluxo;

public class controle_Fluxo_Com_Op_Ternario {
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
