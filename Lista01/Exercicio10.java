public class Exercicio10 {

    public static void main(String[] args) {
        //Imprima os fatoriais de 1 a 10.
        int i =1;
        int fat = 1;
        /*for(i = 1; i <=10; i++){
            fat = fat * i;
            System.out.println("o fatorial de " + i + " é " + fat);

        }*/
        while(i <= 10){
            fat = fat * i;
            i++;
            System.out.println(fat);

        }
        System.out.println(fat);



    }
}
