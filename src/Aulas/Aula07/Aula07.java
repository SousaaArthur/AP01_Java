package Aulas.Aula07;

import java.util.Scanner;

public class Aula07 {

  static Scanner sc = new Scanner(System.in);
  public static int tamanhoVetor(){
    System.out.println("*-* Tamanho do vetor *-*");
    System.out.println("===================================");
    System.out.print("Digite o tamanho do vetor: ");
    int tamanho = sc.nextInt();
    return tamanho;
  }


  public static int[] criarUmVetor(int tamanho){
    System.out.printf("*-* Criando um vetor de %d elementos *-*\n", tamanho);
    System.out.println("===================================");
    int[] vetor = new int[tamanho];
    for(int i = 0; i < tamanho; i++){
      System.out.printf("Digite o %dº elemento: ", i+1);
      vetor[i] = sc.nextInt();
    }

    return vetor;
  }

  public static void imprimir(int[] vetor){
    System.out.println("*-* Vetor *-*");
    System.out.println("===================================");
    for(int i = 0; i < vetor.length; i++){
      System.out.printf("vetor[%d] = %d\n", i, vetor[i]);
    }
  }

  public static void main(String[] args) {
    int tamanho = tamanhoVetor();
    int[] vetor = criarUmVetor(tamanho);
    imprimir(vetor);
  }
}
