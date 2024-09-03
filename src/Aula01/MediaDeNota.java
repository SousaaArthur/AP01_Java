package Aula01;

import java.util.Scanner;

public class MediaDeNota {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira a nota 1: ");
    float n1 = sc.nextFloat(); // Entra de dados

    System.out.print("Insira a nota 2: ");
    float n2 = sc.nextFloat(); // Entra de dados

    System.out.print("Insira a nota 3: ");
    float n3 = sc.nextFloat(); // Entra de dados

    float sum = (n1 + n2 + n3) / 3; // Processamento
    System.out.println("Média: "+ sum); // saida de dados

    sc.close();
  }
}
