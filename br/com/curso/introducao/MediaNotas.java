
package br.com.curso.introducao;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        String cidade;
        String sexo;
        double nota1,nota2,nota3;
        double media;

        System.out.println("INFORME O NOME DO ALUNO: ");
        nome = scan.nextLine();
        System.out.println("NOME DO ALUNO: " + nome);

        System.out.println("INFORME A CIDADE DO ALUNO: ");
        cidade = scan.nextLine();
        System.out.println("CIDADE: " + cidade);

        System.out.println("INFORME O SEXO DO ALUNO: ");
        sexo = scan.nextLine();
        System.out.println("SEXO: " + sexo);

        System.out.println("INFORME A NOTA 1 DO ALUNO: ");
        nota1 = scan.nextDouble();
        System.out.println("NOTA 1: " + nota1);

        System.out.println("INFORME A NOTA 2 DO ALUNO: ");
        nota2 = scan.nextDouble();
        System.out.println("NOTA 2: " + nota2);

        System.out.println("INFORME A NOTA 3 DO ALUNO: ");
        nota3 = scan.nextDouble();
        System.out.println("NOTA 3: " + nota3);

        media =(nota1 + nota2 + nota3)/3;
        System.out.println("A MEDIA DO ALUNO É: " + media);

        if(media >6){
            System.out.println("ALUNO APROVADO!!!");

        }else{
            System.out.println("ALUNO REPROVADO!");
        }




    }
}
