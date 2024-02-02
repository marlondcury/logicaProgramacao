import java.util.Scanner;

/* Faça um programa para ler e escrever dados de uma turma de 5 alunos.
O programa deve pedir dados como nome, idade e sexo.
O programa deve imprimir os dados do aluno mais velho. Use o laço DO-WHILE. */
public class Exercicio6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nomeAluno ="";
        int i=0;
        int idadeAluno = 0;
        String sexoAluno = "";
        int idadeMaior = 0;
        do{
            System.out.println("Insira o nome do aluno");
            String nome = input.next();
            System.out.println("Insira a idade do aluno");
            int idade = input.nextInt();
            System.out.println("Insira o sexo do aluno");
            String sexo = input.next();
          i++;
        if(idade>idadeMaior){
            nomeAluno = nome;
            idadeAluno = idade;
            sexoAluno = sexo;
            idadeMaior = idade;
        }
        } while(i<=5);
        System.out.println("O aluno mais velho possue os seguintes dados");
        System.out.println("Nome: " + nomeAluno);
        System.out.println("Idade: " + idadeAluno);
        System.out.println("Sexo: " + sexoAluno);
        input.close();

    }
}
