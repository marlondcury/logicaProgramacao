/* Escreva um programa que leia o número de cadastro de um funcionário, seu número de
horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
A seguir, mostre na tela o número e o salário do funcionário. */
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o numero do cadastro do funcionario:");
        int cadastroFunc = input.nextInt();
        System.out.println("Insira o numero de horas trabalhadas");
        double numHoras = input.nextDouble();
        System.out.println("Insira o valor que o funcionario recebe por hora:");
        double valorHora = input.nextDouble();
        double salarioFunc = numHoras * valorHora;
        System.out.println("O funcionario de cadastro " + cadastroFunc + " recebe um valor total de " + salarioFunc);


    }
}
