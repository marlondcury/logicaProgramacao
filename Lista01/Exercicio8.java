public class Exercicio8 {

    public static void main(String[] args) {
        //Imprima a soma de 1 até 1000.

        int soma = 0;
        int i = 1;
        /*for(i = 1; i <= 4; i++){
            soma = soma + i;
            System.out.println(soma);

        }
        System.out.println(soma);
        */

        while (i <= 4){
            soma = soma + i;
            i++;
            System.out.println(soma);
        }
        System.out.println(soma);
    }
}
