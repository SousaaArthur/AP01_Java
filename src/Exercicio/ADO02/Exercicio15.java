package Exercicio.ADO02;

import java.util.Scanner;

//−𝐵 ± √𝐵2 − 4 ∗ 𝐴 ∗ 𝐶 / 2 ∗ 𝐴

public class Exercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira o valor de A: ");
    int valueA = sc.nextInt();
    System.out.println("Insira o valor de B: ");
    int valueB = sc.nextInt();
    System.out.println("Insira o valor de C: ");
    int valueC = sc.nextInt();

    double calc = (-valueB + Math.sqrt(valueB * valueB - (4 * valueA * valueC))) / (2 * valueA);

    System.out.println(calc);

    sc.close();
  }
}
