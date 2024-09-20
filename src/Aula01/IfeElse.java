package Aula01;

import java.util.Scanner;

public class IfeElse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a primeira nota");
    float n1 = sc.nextFloat();
    System.out.print("Digite a segunda nota");
    float n2 = sc.nextFloat();
    System.out.print("Digite a terceira nota");
    float n3 = sc.nextFloat();  

    float media = (n1+n2+n3) / 3;

    if (media >= 6) {
      System.out.println("Aprovado!!!");
    } else {
      System.out.println("Reprovado!!!");
    }


    sc.close();
  }
}
