package Aulas.Aula06;

import java.util.Scanner;

public class Calculadora {
  static Scanner sc = new Scanner(System.in);

  public static int menu(){
    int num;
    do{
      System.out.println("CALCULADORA SIMPLES");
      System.out.println("1 - Soma");
      System.out.println("2 - Subtração");
      System.out.println("3 - Multiplicação");
      System.out.println("4 - Divisão");
      System.out.println("5 - Sair");
      System.out.print("Escolha uma opção: ");
      num = sc.nextInt();
      if(num < 1 || num > 4){
        System.out.println("Operação invalida");
      }
      
    } while(num < 1 || num > 4);
    return num;
  }

  public static float adicao(float n1, float n2){
    System.out.println("*-* Adição *-*");
    System.out.println("=================");
    return n1 + n2;
  }

  public static float subtracao(float n1, float n2){
    System.out.println("*-* Subtração *-*");
    System.out.println("=================");
    
    return n1 - n2;
  }

  public static float multiplicacao(float n1, float n2){
    System.out.println("*-* Subtração *-*");
    System.out.println("=================");
    return n1 * n2;
  }

  public static float divisao(float n1, float n2){
    System.out.println("*-* Subtração *-*");
    System.out.println("=================");
    return n1 / n2;
  }

  public static void imprimir(float resultado){
    System.out.println("*-* Imprimir *-*");
    System.out.println("=================");
    System.out.println("Resultado: " + resultado);
  }

  public static float obterNumero(){
    System.out.println("*-* Entrada de dados *-*");
    System.out.println("=========================");
    System.out.println("Digite um numero: ");
    float n = sc.nextFloat();
    return n;
  }

  public static float controlador(int op, float n1, float n2){
    System.out.println("*-* Controlador *-*");
    System.out.println("=================");
    float result = 0;
    switch (op) {
      case '1':
         result = adicao(n1, n2);
        break;
        case '2':
        result = subtracao(n1, n2);
        break;
        case '3':
        result = multiplicacao(n1, n2);
        break;
        case '4':
        result = divisao(n1, n2);
        break;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println("*-* Main *-*");
    int op = menu();
    float n1 = obterNumero();
    float n2 = obterNumero();
    float resultado = controlador(op, n1, n2);
    imprimir(resultado);
  }
} 
