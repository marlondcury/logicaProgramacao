import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        /*Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números.
Por exemplo: se o usuário digitar 2 e -9, a saída deverá ser 3 e -8, porque 3 é consecutivo de 2.
-9 é consecutivo de -9 */

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int num1 = input.nextInt();
        System.out.println("Digite o seugndo numero:");
        int num2 = input.nextInt();
        System.out.printf("Os sucessores são: %d %d", num1+1,num2+1);
        input.close();
    }
}
