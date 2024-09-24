package Exercicio.ADO02;

import java.util.Scanner;

public class Exercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira o primeiro número: ");
    double num1 = sc.nextDouble();
    System.out.println("Insira o segundo número: ");
    double num2 = sc.nextDouble();
    System.out.println("Insira o terceiro número: ");
    double num3 = sc.nextDouble();
    System.out.println("Insira o quarto número: ");
    double num4 = sc.nextDouble();

    double media = (num1 + num2 + num3 + num4) / 4;

    System.out.printf("A media dos quatro números é de: %.2f", media);

    sc.close();
  }
}
