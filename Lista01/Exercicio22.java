import java.util.Scanner;

////Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo menor
public class Exercicio22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro numero");
        int num1 = input.nextInt();
        System.out.println("Insira o segundo numero");
        int num2 = input.nextInt();
        if (num1 > num2){
            double divisao = num1/num2;
            System.out.println("a divisao entre " + num1 + " é " + num2 + " é " +  divisao);
        }
        else{
            double divisao = num2/num1;
            System.out.println("a divisao entre " + num2 + " é " + num1 + " é " + divisao);
        }
        input.close();
    }
}
