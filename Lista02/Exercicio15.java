import java.util.Scanner;

/* Escreva um programa que repita a leitura de uma senha até que ela
 seja válida. Para cada leitura de senha incorreta informada, escrever
 a mensagem "Senha Invalida". Quando a senha for informada corretamente
 deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
 Considere que a senha correta é o valor 2002. Utilize o laço que lhe
 for mais conveniente.
 */
public class Exercicio15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a senha");
        int senha = input.nextInt();
        if(senha == 2002){
            System.out.println("Acesso permitido");
        }
        else{
            boolean acessoSenha = false;
            while(acessoSenha != true){
                System.out.println("ACESSO NEGADO");
                System.out.println("Entre com a senha");
                senha = input.nextInt();
                if(senha == 2002){
                    acessoSenha = true;
                    System.out.println("Acesso permitido");
                }
            }
        }
        input.close();

    }
}
