package Exercicio.ADO03;

import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira um número: ");
    int num1 = sc.nextInt();
    System.out.print("Insira outro número: ");
    int num2 = sc.nextInt();

    System.out.println(
      "Escolhar uma das operações: " + 
      "\n1. Média entre os números digitados" +
      "\n2. Diferença entre os números" +
      "\n3. Produtos entre os números digitados" +
      "\n4. Divisão do primeiro pelo segundo"
    );
    System.out.print("Insira uma das opções: ");
    int operacao = sc.nextInt();

    int calc;

    switch (operacao) {
      case 1:
        calc = (num1 + num2) / 2;
        System.out.println("Resultado das operações: " + calc);
        break;
      case 2:
        if (num1 > num2){
          calc = num1 - num2;
        } else {
          calc = num2 - num1;
        }
        System.out.println("Diferença de número é: " + calc);
        break;
      case 3:
        calc = num1 * num2;
        System.out.println("Valor do produtos digitado é: " + calc);
        break;
      case 4: 
        calc = num1 / num2;
        System.out.println("Resultado da divisão é: " + calc);
        break;
      default:
        System.out.println("Opção invalida!!");
        break;
    }

    sc.close();
  }
}
