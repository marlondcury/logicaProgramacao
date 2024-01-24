import org.w3c.dom.ls.LSOutput;

import javax.xml.transform.Source;
import java.util.Scanner;

/*Fazer um algoritmo que leia dois números L e R. O programa deve verificar a maior área entre um quadrado
de lado L e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Círculo". */
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor de L");
        double valorL = input.nextDouble();
        System.out.println("Insira o valor de R");
        double valorR = input.nextDouble();
        double areaQuadr = Math.pow(valorL,2);
        double areaCirc = Math.PI * Math.pow(valorR,2);
        if(areaQuadr > areaCirc){
            System.out.println("Area do quadrado é maior que a do circulo");
        }
        else{
            System.out.println("Area do circulo é maior que a do quadrado");
        }
        input.close();

    }
}
