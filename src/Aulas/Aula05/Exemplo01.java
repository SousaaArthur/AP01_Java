package Aulas.Aula05;

import java.util.Scanner;

public class Exemplo01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira um limite:");
    int limite = sc.nextInt();
    int inicial = 1;

    while(inicial <= limite){
      if(inicial % 2 == 0){
        System.out.println("i = " + inicial);
      }
      inicial++;
    }
    System.out.println("Fora do laço de repetição!");
  }
}
