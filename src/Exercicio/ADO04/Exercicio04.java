package Exercicio.ADO04;

import java.util.Scanner;

// Leia o nome um número do usuário um número N e escreva o nome dele na tela N vezes. 
public class Exercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o seu nome: ");
    String name = sc.next();

    System.out.print("Insira um número: ");
    int num = sc.nextInt();

    for(int i = 1; i <= num; i++){
      System.out.println(i + ". " + name);
    }

    sc.close();
  }
}
