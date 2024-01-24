import java.util.Scanner;
/*Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C
com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a
mensagem "Valores aceitos", senão escrever "Valores não aceitos". */
public class Exercicio25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor de A");
        int valorA = input.nextInt();
        System.out.println("Insira o valor de B");
        int valorB = input.nextInt();
        System.out.println("Insira o valor de C");
        int valorC = input.nextInt();
        System.out.println("Insira o valor de D");
        int valorD = input.nextInt();
        if(valorB > valorC && valorD > valorA && ((valorD + valorC) > (valorA + valorB)) && valorC > 0 && valorD > 0 && (valorA %2 == 0)){
            System.out.println("valores aceitos");
        }
        else{
            System.out.println("valores não aceitos");
        }
        input.close();
    }
}
