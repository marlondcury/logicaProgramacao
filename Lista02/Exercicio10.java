/* Faça um programa que calcule e imprima o resultado da soma abaixo
(lembre-se de que tanto as divisões quanto o
resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.
 */

public class Exercicio10 {
    public static void main(String[] args){
    double i;
    double soma =0;
    for(i=1; i<=20;i++){
        soma += (1/i);

    }
        System.out.println(soma);

    }
}
