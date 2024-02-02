/* Faça um programa que leia um número inteiro N maior do que zero e calcule o fatorial desse número. Fatorial de N é
        representado por N! e calculado da seguinte maneira: 𝑁! = 𝑁 ∗ (𝑁 − 1) ∗ (𝑁 − 2) ∗. . .∗ 3 ∗ 2 ∗ 1 Utilize o laço que
        lhe for mais conveniente. */

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com um numero positovo");
        int num = input.nextInt();
        int i;
        int far = 1;
        if(num < 0){
            System.out.println("Numero invalido, entre com um numero positivo");
        }
        else{
            for(i = 1; i <= num; i++ ){
                 far *=i;

            }
        }
        System.out.println(far);
        input.close();
    }
}
