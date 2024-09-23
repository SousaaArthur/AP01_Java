package Aula01.Exercicio;

import java.util.Scanner;

// Fazer um algoritmo que leia três números e imprime o maior deles.
public class Exercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o primeiro número: ");
    int num1 = sc.nextInt();
    System.out.print("Insira o segundo número: ");
    int num2 = sc.nextInt();
    System.out.print("Insira o terceiro número: ");
    int num3 = sc.nextInt();

    if (num1 > num2 && num1 > num3){
      System.out.println("O maior número é o " + num1 );
    } else if (num2 > num1 && num2 > num3){
      System.out.println("O maior número é o " + num2 );
    } else {
      System.out.println("O maior número é o " + num3 );
    }
    
    sc.close();
  }
}
