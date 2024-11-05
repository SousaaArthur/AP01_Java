package Aulas.Aula06;

import java.util.Scanner;



public class Aula06 {

  public static int obterNumero(){
    System.out.println("*-* Entrada de Dados *-*");
    System.out.println("==================================");
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int numero = sc.nextInt();
    return numero;
  }

  public static void imprimir(int n){
    System.out.println("*-* Imprimir Resultado *-*");
    System.out.println("==================================");
    System.out.println("Resultado: " + n);
  }

  public static int minimo(int n1, int n2){
    System.out.println("*-* Encontra o Menor Número *-*");
    int menor = 0;
    if(n1 < n2){
      menor = n1;
    } else {
      menor = n2;
    }
    return menor;
  }

  public static void main(String[] args) {
    System.out.println("**** Main ****");
    System.out.println("==================================");
    int a = obterNumero();
    int b = obterNumero();
    int resultado = minimo(a, b);

    imprimir(resultado);
  }
}
