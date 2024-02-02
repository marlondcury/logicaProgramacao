import java.util.Scanner;

/* Leia um valor inteiro N. Este valor será a quantidade de
 valores que serão lidos em seguida do usuário. Para cada valor lido,
 mostre uma mensagem em português dizendo se este valor lido é par (PAR),
 ímpar (ÍMPAR), positivo (POSITIVO) ou negativo (NEGATIVO). No caso
 do valor ser igual a zero (0), seu programa deverá imprimir apenas
 NULO. Utilize o laço DO-WHILE.
 */
public class Exercicio12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a quantidade de numero que sera lida");
        int qtdNum = input.nextInt();
        int i;
        int numLido;
        do{
            for (i=1; i <= qtdNum; i++){
                System.out.println("Entre com um numero");
                numLido = input.nextInt();
                if(numLido > 0 && numLido %2 ==0){
                    System.out.println("numero positivo e par");
                } else if (numLido > 0 && numLido %2 != 0) {
                    System.out.println("numero positivo e impar");

                } else if (numLido < 0 && numLido %2 ==0) {
                    System.out.println("numero negativo e par");

                } else if (numLido <0 && numLido %2 !=0) {
                    System.out.println("numero negativo e impar");

                } else if (numLido == 0) {
                    System.out.println("nulo");
                }
            }

        } while(qtdNum >= i);
        input.close();
    }
}
