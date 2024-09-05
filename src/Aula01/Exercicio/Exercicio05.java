package Aula01.Exercicio;

import java.util.Scanner;

public class Exercicio05 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

  System.out.print("Insira o lado do quadrado: ");
  int num = sc.nextInt();

  int calc = num * num;

  System.out.println("A área do quadrado de lado " + num +  " é de: " + calc);

    sc.close(); 
  }
}
