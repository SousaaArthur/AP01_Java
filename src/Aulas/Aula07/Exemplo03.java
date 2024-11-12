package Aulas.Aula07;

import java.util.Scanner;

public class Exemplo03 {
  public static void entrada(int[] vetor, int n) {
    System.out.println("*-* Recebendo entrada *-*");
    System.out.println("===================================");
    Scanner leitor = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      System.out.printf("Digite o %dº número: ", i + 1);
      vetor[i] = leitor.nextInt();
    }
  }

  public static void somar(int[] vetor, int n) {
    System.out.println("*-* Calculando soma, maior e menor valores *-*");
    System.out.println("===================================");
    int soma = 0;
    int menor = vetor[0];
    int maior = vetor[0];
    
    for (int j = 0; j < n; j++) {
      soma += vetor[j];
      if (vetor[j] < menor) {
        menor = vetor[j];
      }
      if (vetor[j] > maior) {
        maior = vetor[j];
      }
    }

    System.out.println("Soma: " + soma);
    System.out.println("Menor valor: " + menor);
    System.out.println("Maior valor: " + maior);
  }

  public static void imprimir(int[] vetor, int n, int menor, int maior) {
    System.out.println("*-* Imprimindo vetor *-*");
    System.out.println("===================================");
    for (int i = 0; i < n; i++) {
      System.out.printf("vetor[%d] = %d", i, vetor[i]);
      
      if (vetor[i] == menor) {
        System.out.printf(" <-- menor");
      } else if (vetor[i] == maior) {
        System.out.printf(" <-- maior");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n = 10;
    int vetor[] = new int[n];
    
    entrada(vetor, n);
    
    int soma = 0;
    int menor = vetor[0];
    int maior = vetor[0];

    for (int i = 0; i < n; i++) {
      soma += vetor[i];
      if (vetor[i] < menor) {
        menor = vetor[i];
      }
      if (vetor[i] > maior) {
        maior = vetor[i];
      }
    }

    imprimir(vetor, n, menor, maior);

    System.out.println("Soma: " + soma);
    System.out.println("Menor valor: " + menor);
    System.out.println("Maior valor: " + maior);
  }
}
