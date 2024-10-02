package Exercicio.ADO04;

import java.util.Scanner;

// Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
public class Exercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o seu nome: ");
    String name = sc.next();

    for(int i = 0; i < 10; i++){
      System.out.println(name);
    }

    sc.close();
  }
}
