import java.util.Scanner;

/* Fazer um algoritmo que leia os dois lados A e B de um triângulo retângulo e calcula a hipotenusa do triângulo.
Para esse caso, considere que ℎ𝑖𝑝𝑜𝑡𝑒𝑛𝑢𝑠𝑎 = √𝐴² + 𝐵²
Dica: nesse programa, você deve usar a função matemática Math.sqrt(). Por exemplo, a raiz de 121 ficaria Math.sqrt(121).
*/
public class Exercicio14 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("insira o primeiro lado");
    double ladoa = input.nextDouble();
    ladoa = Math.pow(ladoa,2);
    System.out.println("Insira o segundo lado");
    double ladob = input.nextDouble();
    ladob = Math.pow(ladob,2);
    double hip = ladoa + ladob;
    hip = Math.sqrt(hip);
        System.out.println(hip);

    }
}
