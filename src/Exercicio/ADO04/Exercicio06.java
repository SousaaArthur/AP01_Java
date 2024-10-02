package Exercicio.ADO04;

import java.util.Scanner;

// Leia a idade de 20 pessoas e exiba a soma das idades. 
public class Exercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sum = 0;

    for(int i = 1; i <= 20; i++){
      System.out.print("Insira a " + i + "º " + "idade: ");
      int age = sc.nextInt();
      sum+=age;
    }

    System.out.println("A somas das idades é: " + sum);

    sc.close();
  }
}
