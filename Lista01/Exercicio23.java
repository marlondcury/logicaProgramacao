
/*Leia 3 números decimais A, B e C e efetue o cálculo das raízes da equação de Bhaskara.
Se não for possível calcular as raízes, ou seja, caso haja uma divisão por 0 ou raiz de número negativo, mostre
a mensagem correspondente “Impossível calcular”. */

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o coeficiente a da equação");
        float numA = input.nextFloat();
        System.out.println("Insira o coeficiente b da equação");
        float numB = input.nextFloat();
        System.out.println("Insira o coeficiente c da equação");
        float numC = input.nextFloat();
        float delta = ((float)Math.pow(numB,2) - (4 * numA * numC));

        if(delta < 0 || numA == 0){
            System.out.println("Impossivel calcular");
        } else if (delta ==0) {
            float x = (-numB / 2* numA);
            System.out.println("A raíz é unica com o valor de: " + x);
        }
        else{
            float x1 = (float) ((-numB - Math.sqrt(delta))/(2 * numA));
            float x2 = (float) ((-numB + Math.sqrt(delta))/(2 * numA));
            System.out.println("As raizes da esquação são: " + x1 + " e " + x2);
        }
        input.close();
    }
}
