package Aulas.Aula06;

import java.util.Scanner;

// Escreva uma função que receba por parâmetro um
// número n, inteiro e positivo, imprima a soma de
// todos os números compreendidos de 1 até n.
public class Exercicio01 {

  public static int obterNumero(){
    System.out.println("*-* Entrada de Dados *-*");
    System.out.println("==================================");
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int numero = sc.nextInt();
    return numero;
  }

  public static int somatorio(int n){
    int sum = 0;
    for(int i = 0; i <= n; i++){
      sum+=i;
    }
    return sum;
  }

  public static void main(String[] args) {
    int n = obterNumero();
    int sum = somatorio(n);
    System.out.println("Soma: " + sum);
  }
}
