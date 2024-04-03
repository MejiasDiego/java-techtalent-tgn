package UD8.Extras;

import java.util.Scanner;

public class CuentaBancaria {
	private String numeroCuenta = "123456789";
	private double saldo = 0;

	public CuentaBancaria(String numeroCuenta, double saldo) {
		this.numeroCuenta = "123456789";
		this.saldo=hacerIngreso(this.saldo);
		this.saldo=sacarDinero(this.saldo);

	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public static double hacerIngreso(double saldo) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Indique el importe a ingresar");
		double ingreso = 0;
		ingreso = scanner.nextDouble();
		saldo+=ingreso;
		return saldo;
	}
		public static double sacarDinero(double saldo) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Indique el importe a sacar");
			double sacada = 0;
			sacada = scanner.nextDouble();
			saldo-=sacada;
			return saldo;
	}
	public static void main(String[] args) {
		CuentaBancaria cuentaBancaria1 = new CuentaBancaria("123456789", 0);
		System.out.println(cuentaBancaria1.getSaldo());
}}
