package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite a primeira nota: ");
        nota1 =  entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 =  entrada.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("Sua media é " + media);

        entrada.close();

    }
    
}
