package Exercicio.ADO02;

import java.util.Scanner;

// Escreva um programa que leia o número de cadastro de um funcionário, seu número de horas trabalhadas,
// o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre na tela o número 
// e o salário do funcionário.
public class Exercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o número de cadastro: ");
    int registerNum = sc.nextInt();
    System.out.print("Insira número de horas trabalhadas: ");
    int hours = sc.nextInt();
    System.out.print("Insira o salário do funcionário: ");
    double wage = sc.nextDouble();

    double calc = hours * wage;

    System.out.printf(
      "Número de cadastro: %d%n Horas trabalhada:  %dHrs%n Salário por horas: R$%.2f%n Salário: R$%.2f", registerNum, hours, wage, calc
    );

    sc.close();
  }
}
