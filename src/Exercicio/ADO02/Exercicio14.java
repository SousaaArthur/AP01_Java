package Exercicio.ADO02;

import java.util.Scanner;

// Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo menor.

public class Exercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira um número: ");
    int num1 = sc.nextInt();
    System.out.print("Insira outro número: ");
    int num2 = sc.nextInt();

    int div;

    if (num1 > num2){
      div = num1 / num2;
      System.out.println(
        "Maior número: " + num1 +
        "\nMenor número: " + num2 + 
        "\nA divisão do maior número pelo menor é de: " + div
      );
    } else {
      div = num2 / num1;
      System.out.println(
        "Maior número: " + num2 +
        "\nMenor número: " + num1
        );
      System.out.printf("A divisão do maior número pelo menor é de: %.2f" ,div);
    }

    sc.close();
  }
}
