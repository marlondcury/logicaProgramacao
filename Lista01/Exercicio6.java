import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        /*Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
A = b*h/2

b) a área do círculo de raio C. (π = 3.14159)
A = pi * raio²

c) a área do trapézio que tem A e B por bases e C por altura.
A = (B+b).h / 2

d) a área do quadrado que tem lado B.
A = lado * lado

e) a área do retângulo que tem lados A e B.
A = lado * lado

f) o perímetro do retângulo que tem lados A e B */

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        float num1 = input.nextFloat();
        System.out.println("Digite o segundo numero:");
        float num2 = input.nextFloat();
        System.out.println("Digite o terceiro numero");
        float num3 = input.nextFloat();

        float areaTriang = (num2 * num1) / num3;
        System.out.printf("area do triangulo é %.2f\n", areaTriang);

        double areaCirc =  3.14 * Math.pow(num3,2);
        System.out.printf("area do circulo de raio %.1f é %.2f\n",num3, areaCirc);

        float areaTrap = (num1 + num2) * num3 / 2;
        System.out.println("A area do trapezio é:" + areaTrap);

        float areaQuad = num2 * num2;
        System.out.println("A area do quadrado é: " + areaQuad);

        float areaRet = num1 * num2;
        System.out.println("A area do retangulo é: " + areaRet);


        input.close();
    }
}
