package Aula01.Atividade_Sala;

import java.util.Scanner;

public class Atividade03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira sua idade: ");
    byte idade = sc.nextByte();
    System.out.print("Insira sua altura: ");
    double altura = sc.nextDouble();
    System.out.print("Insira seu peso: ");
    double peso = sc.nextDouble();

    double imc = peso / Math.pow(altura, 2);

    if (idade >= 20) {
      if (imc < 18 ){
        System.out.println(
          "Idade: " + idade + 
          "\nPeso: " + peso + 
          "\nIMC: " + imc +
          "Resultado: Abaixo do peso"
        );
      } else if (imc <= 24) {
        System.out.println(
          "Idade: " + idade + 
          "\nPeso: " + peso + 
          "\nIMC: " + imc +
          "Resultado: Normal"
        );
      } else if (imc <= 29) {
        System.out.println(
          "Idade: " + idade + 
          "\nPeso: " + peso + 
          "\nIMC: " + imc +
          "Resultado: Sobrepeso"
        );
      } else {
        System.out.println(
          "Idade: " + idade + 
          "\nPeso: " + peso + 
          "\nIMC: " + imc +
          "Resultado: Obsidade"
        );
      }
    } else {
      System.out.println("Idade insuficiente! Idade minima de 20 anos.");
    }

    sc.close();
  }
}
