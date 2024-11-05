package Aulas.Aula05;

import java.util.Scanner;

public class Exemplo02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("CALCULADORA SIMPLES");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");
    int opcao = sc.nextInt();

    do{
      switch(opcao){
        case 1:
          System.out.print("Insira o primeiro número: ");
          int num1 = sc.nextInt();
          System.out.print("Insira o segundo número: ");
          int num2 = sc.nextInt();
          System.out.println("Resultado: " + (num1 + num2));
          break;
        case 2:
          System.out.print("Insira o primeiro número: ");
          num1 = sc.nextInt();
          System.out.print("Insira o segundo número: ");
          num2 = sc.nextInt();
          System.out.println("Resultado: " + (num1 - num2));
          break;
        case 3:
          System.out.print("Insira o primeiro número: ");
          num1 = sc.nextInt();
          System.out.print("Insira o segundo número: ");
          num2 = sc.nextInt();
          System.out.println("Resultado: " + (num1 * num2));
          break;
        case 4:
          System.out.print("Insira o primeiro número: ");
          num1 = sc.nextInt();
          System.out.print("Insira o segundo número: ");
          num2 = sc.nextInt();
          System.out.println("Resultado: " + (num1 / num2));
          break;
        case 5:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida!");
      }
      System.out.println("1 - Soma");
      System.out.println("2 - Subtração");
      System.out.println("3 - Multiplicação");
      System.out.println("4 - Divisão");
      System.out.println("5 - Sair");
      System.out.print("Escolha uma opção: ");
      opcao = sc.nextInt();
    } while(opcao != 5);
  }
}
