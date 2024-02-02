import java.util.Scanner;

/* Escreva um programa para ler a quantidade de alunos existentes em uma turma.
 Depois disso, o programa deve ler as notas de cada um destes alunos, calcular
 e mostrar na tela a média aritmética destas notas. Utilize o laço WHILE.
 */
public class Exercicio9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a quantidade de alunos:");
        int quantAlunos = input.nextInt();
        int i = 1;
        double soma =0;
        double nota;
        while(i <= quantAlunos){
            System.out.println("Insira a nota do aluno " + i);
            nota = input.nextInt();
            soma +=nota;
            i++;
        }
       double media = soma/quantAlunos;
        System.out.println("A media artimetica das notas é: " + media);
        input.close();
    }
}
