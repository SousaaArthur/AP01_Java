package Exercicio.ADO03;

import java.util.Scanner;

public class Exercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(
      "O escolha um item do cardápio: " +
      "\n100. Cachorro Quente - R$ 1,70" +
      "\n101. Bauru Simples - R$ 2,30" +
      "\n102. Bauru com Bacon - R$ 2,60" +
      "\n103. Hambúrguer - R$ 2,40" +
      "\n104. Cheeseburguer - R$ 2,50" +
      "\n105. Refrigerante - R$ 1,00"
    );  
    System.out.print("Digite sua escolha: ");
    int item = sc.nextInt();
    System.out.print("Digite a quantidade de itens consumido: ");
    int quant = sc.nextInt();

    double total = 0;

    switch (item) {
      case 100:
        total = quant * 1.70;
        System.out.printf("Total a pagar: R$%.2f\n", total);
        break;
      case 101:
        total = quant * 2.30;
        System.out.printf("Total a pagar: R$%.2f\n", total);
        break;
      case 102:
        total = quant * 2.60;
        System.out.printf("Total a pagar: R$%.2f\n", total);
        break;
      case 103:
        total = quant * 2.40;
        System.out.printf("Total a pagar: R$%.2f\n", total);
        break;
      case 104:
        total = quant * 2.50;
        System.out.printf("Total a pagar: R$%.2f\n", total);
        break;
      case 105:
        total = quant * 1.00;
        System.out.printf("Total a pagar: R$%.2f\n", total);
        break;
      default:
      System.out.printf("Total a pagar: R$%.2f\n", total);
        break;
    }

    sc.close();
  }
}
