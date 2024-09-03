package Aula01;

import java.util.Scanner;

public class Atividade01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double n1, n2, n3, sum; // Declara a váriavel
    String name; // Declara a váriavel

    System.out.print("Insira o nome do aluno: ");
    name = sc.next(); // Entra de dados

    System.out.print("Insira a nota 1: ");
    n1 = sc.nextDouble(); // Entra de dados
    System.out.print("Insira a nota 2: ");
    n2 = sc.nextDouble(); // Entra de dados
    System.out.print("Insira a nota 3: ");
    n3 = sc.nextDouble(); // Entra de dados
    
    sum = (n1 + n2 + n3) / 3; // Processamento de Dados

    System.out.printf("A média do %s é de %.2f", name, sum); // saida de dados

    sc.close();
  }
}
