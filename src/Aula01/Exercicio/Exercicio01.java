package Aula01.Exercicio;

import java.util.Scanner;

// Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois números. 
public class Exercicio01 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira um número: ");
    int number1 = sc.nextInt();
    System.out.print("Insira outro número: ");
    int number2 = sc.nextInt();

    int multi = number1 * number2;

    System.out.println("A multiplicação de " + number1 + " e " + number2 + " é de: " + multi);

    sc.close();
  }
}
