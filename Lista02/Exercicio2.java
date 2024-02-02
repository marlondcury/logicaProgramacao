import java.util.Scanner;

/* Faça um programa que leia um número N do usuário, some
todos os números inteiros de 1 a N, e mostre o
resultado obtido. Use o laço WHILE. */
public class Exercicio2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com um numero");
        int n = input.nextInt();
        int soma = 0;
        int i =1;
        while(i<=n){
            soma += i;
            i++;
            System.out.println(soma);

        }
        System.out.println(soma);
        input.close();
    }
}
