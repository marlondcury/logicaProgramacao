import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        /*

1) Fazer uma classe Ex1Primos para:
• Receber um inteiro N do usuário
• Testar se este inteiro é primo ou não e informar*/

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = entrada.nextInt();
        if(numero % 2 == 0){
            System.out.println("Numero par");
        }
        else{
            System.out.println("Numero impar");
        }
        entrada.close();
    }
}
