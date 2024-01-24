import java.util.Scanner;

public class Exercicio12 {
/*Faça um programa para calcular o estoque médio de uma peça, sendo que:
ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.*/

    public static void main(String[] args) {
        int estoqueMedio, qtdMin, qtdMax;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a quantidade minima:");
        qtdMin = entrada.nextInt();
        System.out.println("Insira a quantidade maxima:");
        qtdMax = entrada.nextInt();
        estoqueMedio = (qtdMax + qtdMin)/2;
        System.out.println("o estoque medio é: "+ estoqueMedio);


    }

}
