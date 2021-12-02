package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        double salario, novoSalario;

        System.out.println("Digite seu salário: ");
        salario =  entrada.nextDouble();

        novoSalario = salario * 1.25;

        System.out.println("Novo salário: R$" + novoSalario);
        
        entrada.close();
    }
    
}
