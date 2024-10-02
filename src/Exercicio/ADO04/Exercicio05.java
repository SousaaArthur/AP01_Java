package Exercicio.ADO04;

import java.util.Scanner;

// Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números. 
public class Exercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sum = 0;

    for(int i = 1; i <= 10; i++){

      System.out.print("Insira o número " + i + ": ");
      int num = sc.nextInt();
      sum+=num;
    }

    System.out.println("A soma total é: " + sum);

    sc.close();
  }
}
