/*Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus divisores positivos
próprios (excluindo ele mesmo) é igual ao próprio número. Por exemplo o número 6 é perfeito, pois 1+2+3 é igual a 6.
Sua tarefa é escrever um programa que imprima se um determinado número é perfeito ou não. Utilize o laço que lhe for
mais conveniente.*/

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com um numero");
        int num = input.nextInt();
        int i;
        int soma = 0;
        for( i = 1; i < num; i ++){
            if( num %i ==0){
                soma +=i;
            }
        }
        System.out.println(soma);
        if(soma == num){
            System.out.println("numero perfeito");
        }
        else{
            System.out.println("numero nao é perfeito");
        }
        input.close();

    }
}
