package Aulas;

import java.util.Scanner;

public class ExemploDeSwitch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira a primeira nota: ");
    float n1 = sc.nextFloat();
    System.out.print("Insira a segunda nota: ");
    float n2 = sc.nextFloat();
    System.out.print("Insira a terceira nota: ");
    float n3 = sc.nextFloat();

    float media = (n1 + n2 + n3) / 3;
    char conceito = 'A';

    if (media >= 9 && media <= 10) {
      conceito = 'A';
    } else if (media >= 8 && media < 9) {
      conceito = 'B';
    } else if (media >= 7 && media < 8) {
      conceito = 'C';
    } else if (media >= 6 && media < 7) {
      conceito = 'D';
    } else{
      conceito = 'E';
    } 

    System.out.println("Média: " + media);
    System.out.println("Conceito: " + conceito);

    switch (conceito) {
      case 'A':
        System.out.println("Excelente!!!");
        break;
      case 'B':
        System.out.println("Muito bom!");
        break;
      case 'C':
        System.out.println("Bom");
        break;
      case 'D': 
        System.out.println("Regular!");
        break;
      case 'E':
        System.out.println("Tente novamente!");
        break;
      default:
        System.out.println("Conceito invalido!!!");
        break;
    }

    sc.close();
  }
}
