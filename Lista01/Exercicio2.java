import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        /*
• Sortear um número de 0 a 1000 (dica: usar Math.random())
• Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
menor do que o número sorteado.
• Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
quantas tentativas ele acertou.*/

        Scanner entrada = new Scanner(System.in);
        int numero = (int) (Math.random() * 100);

        System.out.println("Digite um palpite: ");
        int palpite = entrada.nextInt();
        int count = 0;
        boolean verdade = false;


        while( verdade == false) {
            if (numero == palpite) {
                System.out.println("Voce acertou");
                verdade = true;
            }else if (palpite < numero) {
                System.out.println("Digite um numero maior");
                palpite = entrada.nextInt();
            } else {
                System.out.println("Digite um numero menor");
                palpite = entrada.nextInt();
            }

            count++;

        }
        System.out.println("Foram necessarias " + count + " tentativas");
        entrada.close();

        }

    }
