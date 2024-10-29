package Aulas.Aula05;

import java.util.Scanner;

public class Exemplo03 {
  public static void main(String[] args) throws InterruptedException {
    Scanner sc = new Scanner(System.in);
    
    int opcao = 0;
    do{
      System.out.println("Insira a quantidade de pratos sujos: ");
      int pratosSujos = sc.nextInt();
  
      System.out.println("Iniciando o processo de lavagem de pratos...");
      int i = 1;
      Thread.sleep(1000);
      while(i <= pratosSujos){
        System.out.println("Lavando... " + pratosSujos);
        pratosSujos--;
        Thread.sleep(1000);
      }
      System.out.println("Finalizando o processo de lavagem de pratos...");
      Thread.sleep(1000);
      System.out.println("Processo finalizado!");
      
      System.out.println("Deseja lavar mais pratos? (1 - Sim / 2 - Não)");
      opcao = sc.nextInt();
    } while(opcao == 1);
    Thread.sleep(1000);
    System.out.println("Encerrando o programa...");
  }
}
