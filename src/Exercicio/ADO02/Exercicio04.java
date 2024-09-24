package Exercicio.ADO02;

import java.util.Scanner;

/*
 * Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números.
 * (Por exemplo: se o usuário digitar 2 e -9, a saída deverá ser 3 e -8, 
 * porque 3 é consecutivo de 2. –8 é consecutivo de –9)
 */
public class Exercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira um número: ");
    int num1 = sc.nextInt();
    System.out.print("Insira outro número: ");
    int num2 = sc.nextInt();

    int sum1 = num1 + 1;
    int sum2 = num2 + 1;

    System.out.println("O número consecutivo de " + num1 + " é de: " + sum1);
    System.out.println("O número consecutivo de " + num2 + " é de: " + sum2);

    sc.close();
  }
}
