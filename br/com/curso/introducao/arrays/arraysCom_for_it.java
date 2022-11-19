package br.com.curso.introducao.arrays;

public class arraysCom_for_it {
    public static void main(String[] args) {
        int[] numero = new int [5];
        int[] numero2 = {1, 2, 3, 4, 5};
        int[] numero3 = new int[]{1, 2, 3, 4, 5};

        int i = 0;
        for(; i<numero2.length; i++){
            System.out.println(numero2[i]);
        }
        for(int num : numero){
            System.out.println(num);
        }
    }
}
