package Exercicio.ADO02;

import java.util.Scanner;

// Fazer um algoritmo que lê um número e verifica se ele é negativo. 
// Se for negativo, imprimir na tela a mensagem "Numero negativo"
public class Exercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira um número: ");
    int num = sc.nextInt();

    if(num < 0){
      System.out.println(num + " é um número negativo!!!");
    } else {
      System.out.println(num + " é um número positivo!!!");
    }
    
    sc.close();
  }
}
