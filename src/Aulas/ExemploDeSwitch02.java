package Aulas;

import java.util.Scanner;

public class ExemploDeSwitch02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Número:");
    int num = sc.nextInt();

    switch (num) {
      case 1:
        System.out.println("Número " + 1);
      case 2: 
      System.out.println("Número " + 2);
      case 3: 
      System.out.println("Número " + 3);
      case 4: 
      System.out.println("Número " + 4);
      case 5: 
      System.out.println("Número " + 5);
    }

    sc.close();
  }
}
