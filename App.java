import java.util.Scanner;

import Contas.Contas;

public class App {
    /*O objetivo do projeto é desenvolver uma aplicação relacionada a bancos, vamos
aplicar os conceitos de POO e as regras de negócio para a estruturação do código.
Cadastre os clientes em seu banco, faça depósitos, faça saques e transferências para
outras contas de clientes. */


    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do titular da conta: ");
        String titular = scan.nextLine();
        System.out.println("Digite o numero da conta: ");
        int numeroconta = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite o saldo inicial: ");
        double saldo = scan.nextDouble();
        scan.nextLine();

        Contas conta = new Contas(titular, numeroconta, saldo);

        scan.close();
    }
}
