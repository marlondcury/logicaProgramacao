import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        /*
/*Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao expoente).
Exemplo: 5 elevado ao cubo ficaria Math.pow(5,3). Você pode trocar esses números por variáveis. */

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a base: ");
        int base = input.nextInt();
        System.out.println("Digite o expoente: ");
        int exp = input.nextInt();
        int res = (int) Math.pow(base,exp);
        System.out.println(res);
        input.close();

    }
}
