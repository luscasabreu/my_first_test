package entidades;

public class Conta {
	private int numeroConta;
	private String titular;
	private double saldo;
	
	/* Construtores */
	
	public Conta(int numeroConta, String titular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		deposito(depositoInicial);
	}

	public Conta(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}

	public int getNumerodaconta() {
		return numeroConta;
	}
	
	/* Getters e Setters */
	
	public void getNumerodaconta(int numerodaconta) {
		this.numeroConta = numerodaconta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	/* Métodos */
	
	public void deposito (double valor) {
		saldo+=valor;
	}
	
	public void saque (double valor) {
		saldo-=valor;
	}
	
	public String toString() {
		return "Conta: "
				+ numeroConta
				+ ". Titular: "
				+ titular
				+ ". Saldo: R$"
				+ String.format("%.2f", saldo);
	}
		
}

