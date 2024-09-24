package Exercicio.ADO02;

import java.util.Scanner;

// Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas 
// efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de 
// comissão sobre suas vendas efetuadas, calcular e imprimir o total a receber no final do mês.
public class Exercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o nome do vendedor: ");
    String name = sc.next();
    System.out.print("Insira o salário do vendedor: ");
    double wage = sc.nextDouble();
    System.out.print("Insira a vendas do vendedor: ");
    double sales = sc.nextDouble();

    double commission = sales * 0.15;
    double fullSalary = wage + commission; 

    System.out.println("Nome vendedor: " + name);
    System.out.printf("Salário vendedor: %.2f%n", wage);
    System.out.printf("Total de vendas: %.2f%n", sales);
    System.out.printf("Comissão: %.2f%n", commission);
    System.out.printf("Salário no final do mês: %.2f%n", fullSalary);

    sc.close();
  }
}
