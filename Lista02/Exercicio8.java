/* Calcular e mostrar a média aritmética dos números pares compreendidos
entre 13 e 73. Utilize o laço que lhe for mais conveniente.
*/

public class Exercicio8 {
    public static void main(String[] args){
        int i;
        int soma =0;
        int count = 0;
        for(i = 13; i < 73; i++){
            if(i % 2 == 0){
                count++;
                soma += i;
            }

        }
        int media = soma/count;
        System.out.println(" A media artimetica entre 13 e 73 é: " + media);
    }
}
