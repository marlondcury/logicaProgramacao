import java.util.Scanner;

/*Fazer um algoritmo que lê um número e verifica se ele é negativo. Se for negativo, imprimir na tela a
mensagem "Numero negativo" */
public class Exercicio18 {
    public static void main(String[] args){

        Scanner input  = new Scanner(System.in);
        System.out.println("Insira um numero");
        int numero = input.nextInt();
        if (numero < 0){
            System.out.println( "O numero" + numero + " é um numero negativo");
        }
        else{
            System.out.println( "O numero " + numero + " é um numero  positivo");
        }
        input.close();
    }
}
