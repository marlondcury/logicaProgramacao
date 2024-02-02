import java.util.Scanner;

/* Escreva um programa que leia um conjunto de 10 números inteiros positivos.
 Seu programa deve determinar e imprimir o maior deles. Use o laço FOR.
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int maior = 0;

        for (i = 0; i < 10; i++) {
            System.out.println("Insira o numero " + (i+1));
            int num =0;
            num = input.nextInt();
            if(num < 0){
                System.out.println("Digite um numero positivo");
                i--;
            }
            if(num > maior){
                maior = num;
        }
        }
        System.out.println(" O maior numero é " + maior);
        input.close();
    }
}
