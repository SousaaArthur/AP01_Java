package Aulas.Aula07;

import java.util.Scanner;

public class Exemplo02 {

  public static void main(String[] args) {

    int tamanho = 5;
    float[] vetor = new float[tamanho];

    vetor[0] = 1.5f;
    vetor[1] = 2.5f;
    vetor[2] = 3.5f;
    vetor[3] = 4.5f;
    vetor[4] = 5.5f;


    System.out.println("*-* Vetor *-*");
    System.out.println("===================================");

    for(int i = 0; i < vetor.length; i++){
      System.out.printf("vetor[%d] = %.2f\n", i, vetor[i]);
    }

    System.out.println("===================================");

    Scanner sc = new Scanner(System.in);
    System.out.println("Media: ");
    float media = sc.nextFloat();

    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] > media) {
        System.out.printf("vetor[%d] = %.2f\n", i, vetor[i]);
      }
    }
  }
} 
