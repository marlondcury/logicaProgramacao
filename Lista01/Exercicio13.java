import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float cotacaoDolar, valorDolar, valorReal;
        System.out.println("Entre com a cotaçao em dolar: ");
        cotacaoDolar = entrada.nextFloat();
        System.out.println("Entre com o valor em dolares: ");
        valorDolar = entrada.nextFloat();
        valorReal = cotacaoDolar * valorDolar;
        System.out.printf("Seu valor em reais é de %.2f", valorReal);

    }
}
