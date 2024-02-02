/* Escreva um programa que imprima todos os
múltiplos de 7 menores que 200. Use o laço WHILE. */
public class Exercicio7 {
    public static void main(String[] args){
    int i = 0;
    while(i<=200){
        if(i % 7 == 0){
            System.out.println(i);
        }
        i++;
    }
    }
}
