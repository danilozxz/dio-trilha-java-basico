import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner dado = new Scanner(System.in);

        int numeroConta;
        String agenciaBancaria;
        String nomeCliente;
        double saldo;

        System.out.println("=== Sistema de conta bancária ===");
        System.out.println("\nPor favor, digite o seu nome completo: ");
        nomeCliente = dado.nextLine();

        System.out.println("\nPor favor, digite o número da conta: ");
        numeroConta = dado.nextInt();

        dado.nextLine();

        System.out.println("\nPor favor, o nome da sua agência bancária: ");
        agenciaBancaria = dado.nextLine();
        
        System.out.println("\nPor favor, insira o seu saldo: ");
        saldo = dado.nextDouble();

        System.out.println("\nOlá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é: " + agenciaBancaria + ", sua conta é: " + numeroConta + " e o seu saldo de R$" + saldo + " já está disponível para saque!");

        dado.close();

    }
}
