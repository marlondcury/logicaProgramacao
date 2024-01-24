import java.util.Scanner;

/*Fazer uma classe Ex1Primos para:
        • Receber um inteiro N do usuário
        • Testar se este inteiro é primo ou não e informa */
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com um numero inteiro");
        int num = input.nextInt();
        int i;
        boolean ePrimo = true;
        for (i = 2; i <num; i++){
            if(num % i == 0 ){
                ePrimo = false;
            }
            break;
        }

        if(ePrimo){
            System.out.println("o numero " + num + " é primo");
        }
        else{
            System.out.println("o numero " + num + " nao é primo");
        }
        input.close();
    }
}