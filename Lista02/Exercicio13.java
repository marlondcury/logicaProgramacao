import java.util.Scanner;

/* Ler um número inteiro N e calcular e imprimir todos os seus divisores. Exemplo: para o número 6, temos os seguintes
divisores 1, 2, 3, 6. Utilize o laço que lhe for mais conveniente. */
public class Exercicio13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("entre com um numero inteiro");
        int numInt = input.nextInt();
        int i;
        for (i = 1; i <=numInt; i++){
            if(numInt %i == 0){
                System.out.println(i);
            }
        }
        input.close();
    }
}
