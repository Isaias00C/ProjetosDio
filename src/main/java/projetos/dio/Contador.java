package projetos.dio;

import projetos.dio.Exceptions.InvalidNumbersOrderException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (InvalidNumbersOrderException e) {
            System.out.println("O primeiro parametro deve ser maior que o segundo");
            contar(parametroDois, parametroUm);
        }

    }

    static void contar(int parametroUm, int parametroDois) throws InvalidNumbersOrderException {
        if (parametroUm < parametroDois) {
            throw new InvalidNumbersOrderException("O primeiro numero deve ser maior que o segundo");
        }

        int contagem = parametroUm - parametroDois;
        for (int i = 0; i < contagem; i++) {
            System.out.println("imprimindo o numero " + (i + 1));
        }
    }
}