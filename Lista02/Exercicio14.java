import java.util.Scanner;

/* A seguinte sequência de números 0, 1, 1, 2, 3, 5, 8, 13, 21... é conhecida como série de Fibonacci. Nessa sequência,
cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (onde
N < 46) e mostre os N primeiros números dessa série. Utilize o laço que lhe for mais conveniente. */
public class Exercicio14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com um numero entre 0 e 46");
        int num = input.nextInt();
        int i;
        int ant = 0;
        int pos = 1;
        if( num < 0 || num > 46){
            System.out.println("Entre com um numero valido");
        }
        for(i=0; i <= num; i++){
            System.out.println(ant);

            pos = pos + ant;
            ant = pos - ant;
        }
        input.close();

    }

}
