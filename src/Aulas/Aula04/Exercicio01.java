package Aulas.Aula04;

import java.util.Scanner;

public class Exercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Inicio: ");
    int inicio =sc.nextInt();
    System.out.print("Final: ");
    int fim =sc.nextInt();

    if (inicio < fim){
      for (int i = inicio; i <= fim; i++){
        if (i % 2 == 1){
          System.out.println(i + " é impar");
        }
      }
    } else if(fim < inicio) {
      for (int i = inicio; i >= fim; i--){
        if (i % 2 == 0){
          System.out.println(i + " é par");
        }
      }
    } else {
      System.out.println("Valores iguais!!!");
    }
    sc.close();
  }
}