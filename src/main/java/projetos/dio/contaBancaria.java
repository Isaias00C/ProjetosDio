package projetos.dio;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class contaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa: Por favor digite o seu nome:");
        System.out.print("Usuário: ");
        String nome = sc.nextLine();

        System.out.println("Programa: Por favor digite a sua agência:");
        System.out.printf("%s: ", nome);
        int agencia = sc.nextInt();

        System.out.println("Programa: Por favor digite o número da conta");
        System.out.printf("%s: ", nome);
        int numero = sc.nextInt();

        System.out.println("Programa: Por favor digite o seu saldo:");
        System.out.printf("%s: ", nome);
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta numero %d e " +
                "seu saldo %.2f já está disponível para saque", nome, agencia, numero, saldo);

        sc.close();
    }
}