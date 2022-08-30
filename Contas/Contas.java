package Contas;


public class Contas {
    private String titular;
    private int numeroconta;
    private double saldo;

    
    public Contas(String titular, int numeroconta, double saldo) {
        this.titular = titular;
        this.numeroconta = numeroconta;
        this.saldo = saldo;
    }

    public void depositar(double deposito){
        saldo = saldo + deposito;
    }

    public void sacar(double saque){
        saldo = saldo - saque;
    }

    public void transferir(String nome,double transferencia){
        saldo -= transferencia;
        System.out.printf("Foi transferido R$%.2f para a conta de %s",transferencia,nome);
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroconta() {
        return numeroconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
