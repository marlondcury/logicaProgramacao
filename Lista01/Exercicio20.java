import java.util.Scanner;

/*Fazer um algoritmo que leia três números e imprime o maior deles. */
public class Exercicio20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro numero");
        int num1 = input.nextInt();
        System.out.println("Insira o segundo numero");
        int num2 = input.nextInt();
        System.out.println("Insira o terceiro numero");
        int num3 = input.nextInt();

        if(num1 > num2 && num1> num3){
            System.out.println("o numero " + num1 + " é maior");
        }
        else if (num2 > num1 && num2 > num3 ) {
            System.out.println("o numero " + num2 + " é maior");
        }
        else{
            System.out.println("o numero " + num3 + " é maior");
        }
        input.close();

    }
}
