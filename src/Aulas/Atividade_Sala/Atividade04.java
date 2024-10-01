package Aulas.Atividade_Sala;

import java.util.Scanner;

/*
 * Escreva um programa em java que solicita 10 números
 * ao usuário, através de um laço for, mostre qual
 * destes números é o maior
 */
public class Atividade04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int maiorValor = 0;

    for(int i = 0; i < 10; i++){
      System.out.println("Insira o número: ");
      int num = sc.nextInt();
      if (num > maiorValor){
        maiorValor = num;
      }
    }

    System.out.println("O maior valor é: " + maiorValor);

    sc.close();
  }
}
