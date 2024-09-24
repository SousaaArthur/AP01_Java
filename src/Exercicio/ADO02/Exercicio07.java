package Exercicio.ADO02;

import java.util.Scanner;

public class Exercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Insira o valor de A: ");
    double valueA = sc.nextDouble();
    System.out.print("Insira o valor de B: ");
    double valueB = sc.nextDouble();

    double calc = Math.sqrt(valueA * valueA + valueB * valueB);

    System.out.printf("A hipotenusa de %.0f e %.0f do Triângulo retângulo é de: %.2f", valueA, valueB, calc);
    //"A hipotenusa de " + valueA + " e " + valueB + " do Triângulo retângulo é de: " + calc
    sc.close();
  }
}
