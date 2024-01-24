import java.util.Scanner;

/*Leia 3 números decimais A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o
maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos
seguintes casos, sempre escrevendo uma mensagem adequada:
● se A ≥ B+C, apresente a mensagem: NAO FORMA TRIÂNGULO
● se A² = B² + C²
, apresente a mensagem: TRIÂNGULO RETÂNGULO
● se A² > B² + C²
, apresente a mensagem: TRIÂNGULO OBTUSÂNGULO
● se A² < B² + C²
, apresente a mensagem: TRIÂNGULO ACUTÂNGULO
● se os três lados forem iguais, apresente a mensagem: TRIÂNGULO EQUILÁTERO
● se apenas dois dos lados forem iguais, apresente a mensagem: TRIÂNGULO ISÓSCELES */
public class Exercicio26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro numero");
        double numA = input.nextDouble();
        System.out.println("Insira o segundo numero");
        double numB = input.nextDouble();
        System.out.println("Insira o terceiro numero");
        double numC = input.nextDouble();


        //ordenaçao

        if (numA < numB) {
            double aux = numA;
            numA = numB;
            numB = aux;
        }
        if (numA < numC) {
            double aux = numA;
            numA = numC;
            numC = aux;
        }
        if(numB < numC){
            double aux = numB;
            numB = numC;
            numC = aux;
        }

        // Impressão dos números ordenados
        System.out.println("A = " + numA);
        System.out.println("B = " + numB);
        System.out.println("C = " + numC);

//● se A ≥ B+C, apresente a mensagem: NAO FORMA TRIÂNGULO
        if(numA >= (numB + numC)){
            System.out.println("Não forma triangulo");
        }
//● se A² = B² + C², apresente a mensagem: TRIÂNGULO RETÂNGULO
        double numAQuad = Math.pow(numA,2);
        double numBQuad = Math.pow(numB,2);
        double numCQuad = Math.pow(numC,2);
        if(numAQuad == (numBQuad + numCQuad)){
            System.out.println("Triangulo retangulo");
        }
//● se A² > B² + C², apresente a mensagem: TRIÂNGULO OBTUSÂNGULO
        if(numAQuad > (numBQuad + numCQuad)){
            System.out.println("Triangulo obtusangulo");
        }
// se A² < B² + C², apresente a mensagem: TRIÂNGULO ACUTÂNGULO
        if(numAQuad < (numBQuad + numCQuad)){
            System.out.println("Triangulo acutangulo");
        }

       // ● se os três lados forem iguais, apresente a mensagem: TRIÂNGULO EQUILÁTERO
        if(numA == numB && numB == numC){
            System.out.println("triangulo equilatero");
        }
//● se apenas dois dos lados forem iguais, apresente a mensagem: TRIÂNGULO ISÓSCELES
        if((numA == numB || numA == numC) ||(numB == numA || numB == numC) || (numC == numA || numC == numB)){
            System.out.println("triangulo isosceles");
        }
    }
}
