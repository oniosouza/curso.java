package br.com.curso.introducao.exercicios;

public class ImprimindoNumerosPares0a100mil {
    public static void main(String[] args) {
        int valor = 1000000;
        for(int i=0; i<=valor; i++){
            if(i%2==0){
                System.out.println(i);
            }
            //para fazer numeros impares
            //if(i%2!=0)
        }
    }
}
