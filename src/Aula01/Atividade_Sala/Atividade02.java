package Aula01.Atividade_Sala;

import java.util.Scanner;

// Escreva um programa em Java que leia o nome de um aluno, as notas e o número de faltas. O programa deve calcular as média do aluno e imprimir as seguintes mensagens: 
// - Se a média for maior ou igual a 6 e o número de faltas for menor do que 18, o programa deve imprimir "Aprovado!"
// - Se a média for maior ou igual a 6 e o número de faltas for maior que 18. o programa deve imprimir "Reprovado por falta"
// - Se a média for menor que 6 e o número de faltas for menor ou igual a 18, imprimir "Recuperação" - Solicitar uma nova nota ao calculo de uma nova média. Se a média for maior ou igual a 6, imprimir "Aprovado".
// - Caso contrario, imprimir "Reprovado".
public class Atividade02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o seu nome: ");
    String name = sc.next();
    System.out.print("Insira a primeira nota: ");
    float n1 = sc.nextFloat();
    System.out.print("Insira a segunda nota: ");
    float n2 = sc.nextFloat();
    System.out.print("Insira a terceira nota: ");
    float n3 = sc.nextFloat();
    System.out.print("Insira o número de faltas: ");
    byte fouls = sc.nextByte();

    float average = (n1 + n2 + n3) / 3;

    System.out.println(average);
    if (average >= 6 && fouls <= 18) {
      System.out.println(
        "Nome: " + name + 
        "\nMédia: " + average +
        "\nFaltas: " + fouls
      );
      System.out.println("Situação: Aprovado");
    }  else if (average >= 6 && fouls > 18) {
      System.out.println(
        "Nome: " + name + 
        "\nMédia: " + average +
        "\nFaltas: " + fouls
      );
      System.out.println("Situação: Reprovado");
    } else if (average < 6 &&  fouls <= 18){
      System.out.println("Recuperação");
      System.out.print("Insira uma nova nota: ");
      float newNote = sc.nextFloat();
      average = (newNote + average) / 2;
      if (average >= 6) {
        System.out.println(
          "Nome: " + name + 
          "\nMédia: " + average +
          "\nFaltas: " + fouls
        );
        System.out.println("Situação: Aprovado");
      } else {
        System.out.println(
          "Nome: " + name + 
          "\nMédia: " + average +
          "\nFaltas: " + fouls
        );
        System.out.println("Situação: Reprovado");
      }
    } else {
      System.out.println(
        "Nome: " + name + 
        "\nMédia: " + average +
        "\nFaltas: " + fouls
      );
      System.out.println("Situação: Reprovado");
    }

    sc.close();
  }
}
