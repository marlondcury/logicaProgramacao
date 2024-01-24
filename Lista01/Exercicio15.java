//Fazer um algoritmo que leia quatro números e imprime a média aritmética dos quatro números.

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro numero");
        float num1 = input.nextFloat();
        System.out.println("Insira o segundo numero");
        float num2 = input.nextFloat();
        System.out.println("Insira o terceiro numero");
        float num3 = input.nextFloat();
        System.out.println("Insira o quarto numero");
        float num4 = input.nextFloat();

        float media = (num1 + num2 + num3 + num4)/4;
        System.out.println(media);
    }
}
