package Aula01.Exercicio;

import java.util.Scanner;

public class Exercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o valor de A: ");
    double valueA = sc.nextDouble();
    System.out.print("Insira o valor de B: ");
    double valueB = sc.nextDouble();
    System.out.print("Insira o valor de C: ");
    double valueC = sc.nextDouble();

    double areaTriangulo = (valueA * valueC) / 2;
    double areaCirculo = Math.PI * (valueC * valueC);
    double areaTrapezio = (valueA + valueB) * valueC / 2;
    double areaQuadrado = valueB * valueB;
    double areaRetangulo = valueA * valueB;
    double perimetroRetangulo = 2 * (valueA + valueB);

    System.out.printf("Área do Triângulo retângulo: %.0f%n", areaTriangulo);
    System.out.printf("Área do Círculo: %.4f%n", areaCirculo);
    System.out.printf("Área do Trapézio: %.0f%n", areaTrapezio);
    System.out.printf("Área do Quadrado: %.0f%n", areaQuadrado);
    System.out.printf("Área do Retângulo: %.0f%n", areaRetangulo);
    System.out.printf("Perímetro do Retângulo: %.0f", perimetroRetangulo);

    sc.close();
  }
}
