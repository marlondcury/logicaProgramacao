public class Exercicio11 {

    public static void main(String[] args) {
        int atual= 1;
        int anterior = 0;
        while(atual <100){
            System.out.println(atual);
            int proximo = atual + anterior;
            anterior = atual;
            atual = proximo;
        }

    }
}
