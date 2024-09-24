package Aulas;

import java.util.Scanner;

public class EntradaDeDados {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String name;
    System.out.print("Digite seu nome: "); //Escreva

    name = sc.next();

    System.out.println("Olá, " + name);

    sc.close();
  }
}

//AP01_Java