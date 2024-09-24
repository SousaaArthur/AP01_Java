package Exercicio.ADO03;

import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira nota 1: ");
    int n1 = sc.nextInt();
    System.out.print("Insira nota 2: ");
    int n2 = sc.nextInt();

    int media = (n1 + n2) / 2;

    switch (media) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
        System.out.println("Reprovado");
        break;
      case 5: 
      case 6:
      case 7: 
        System.out.println("Exame");
        break;
      case 8:
      case 9: 
      case 10:
        System.out.println("Aprovado");
      default:
        System.out.println("Media Invalida!!!");
        break;
    }

    sc.close();
  }
}
