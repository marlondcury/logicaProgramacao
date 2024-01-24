import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L.

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado");
        int lado = input.nextInt();
        int area = lado * lado;
        System.out.println("A area é " + area + "m²");
        input.close();
    }
}
