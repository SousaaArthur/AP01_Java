package Aula01.Exercicio;

import java.util.Scanner;

// Fazer um algoritmo que leia dois números L e R. O programa deve verificar a maior área entre um
// quadrado de lado L e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Círculo".
public class Exercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o valor de numero L: ");
    int valueL = sc.nextInt();
    System.out.print("Insira o valor de numero R: ");
    int valueR = sc.nextInt();

    double square = Math.pow(valueL, 2);
    double circle = Math.PI * Math.pow(valueR, 2);

    if (square > circle){
      System.out.println("Área do quadrado é maior que a área do circulo!!");
    } else {
      System.out.println("Área do circulo é maior que a área do quadrado!!");
    }

    sc.close();
  }
}
