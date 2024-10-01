package Aulas.Aula04;

import java.util.Scanner;

public class Exemplo02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o inicio da repetição: ");
    int inicio = sc.nextInt();

    System.out.print("Insira o final da repetição: ");
    int fim = sc.nextInt();

    for (int i = inicio; i <= fim; i++){
      if (i % 2 == 1){
        System.out.println(i + " é impar");
      }
    }

    sc.close();
  }
}
