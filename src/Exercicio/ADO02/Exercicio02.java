package Exercicio.ADO02;

import java.util.Scanner;

/*
 * Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência
 * a (base elevada ao expoente). Dica: use a função matemática Math.pow().
 * Exemplo: 5 elevado ao cubo ficaria Math.pow(5, 3). Você pode trocar esses números
 * por variáveis.
 */
public class Exercicio02 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira um número: ");
    double number1 = sc.nextDouble();
    System.out.print("Insira outro número: ");
    double number2 = sc.nextDouble();

    double calc = Math.pow(number1, number2);

    System.out.println("A base de " + number1 + " e o expoente de " + number2 + " é igual a: " + calc);

    sc.close();
  }
}
