package Aula01.Exercicio;

import java.util.Scanner;

/*
 * Fazer um algoritmo que lê dois números e imprime a soma dos quadrados
 * dos dois números.
 * O quadrado de um número A é representado por A2 = A * A.
 */
public class Exercicio03 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira um número: ");
    int number1 = sc.nextInt();
    System.out.print("Insira outro número: ");
    int number2 = sc.nextInt();

    int sum1 = number1 * number1;
    int sum2 = number2 * number2;

    System.out.println("A soma dos quadrados de " + number1 + " é de: " + sum1);
    System.out.println("A soma dos quadrados de " + number2 + " é de: " + sum2);

    sc.close();
  }
}
