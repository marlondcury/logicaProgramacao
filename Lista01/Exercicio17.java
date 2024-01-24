import java.util.Scanner;

/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele
no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
calcular e imprimir o total a receber no final do mês */
public class Exercicio17 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Insira o nome do venderdor");
        String nomeVendedor = input.next();
        System.out.println("Insira seu salario fixo");
        float salarioVendedor = input.nextFloat();
        System.out.println("Insira o toral de vendas do vendedor");
        float totalVendas = input.nextFloat();
        double comissaoVend = totalVendas * 0.15;
        double salarioTotal = salarioVendedor + comissaoVend;
        System.out.println("O vendedor " + nomeVendedor + "recebeu um total de " + salarioTotal);
        input.close();

    }
}
