package Exercicio.ADO03;

import java.util.Scanner;

public class Exercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Escolha um produto de 1 a 15");
    System.out.print("Insira um número: ");
    int value = sc.nextInt();

    switch (value) {
      case 1:
        System.out.println("Alimento não-perecível");
        break;
      case 2:
      case 3:
      case 4:
        System.out.println("Alimento perecível");
        break;
      case 5:
      case 6:
        System.out.println("Vestuário");
        break;
      case 7:
        System.out.println("Higiene Pessoal");
        break;
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14: 
      case 15:
      System.out.println("Limpeza e utensílios domésticos");
      default:
        System.out.println("Código inválido");
        break;
    }

    sc.close();
  }
}


/*
 * 1- Alimento não-perecível
 2, 3 ou 4 – Alimento perecível
 5 ou 6 –Vestuário
 7 – Higiene Pessoal
 8 até 15- Limpeza e utensílios domésticos
 Qualquer outro código – código inválido
 */