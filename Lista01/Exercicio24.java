import java.util.Scanner;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.  */
public class Exercicio24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a hora que começou a jogar");
        int horaInic = input.nextInt();
        System.out.println("Insira a hora que terminou de jogar");
        int horaFinal = input.nextInt();

        int horaTotal = horaFinal - horaInic;
        if(horaTotal<0){
            horaTotal +=24;
        }
        System.out.println(horaTotal);
        input.close();
    }
}
