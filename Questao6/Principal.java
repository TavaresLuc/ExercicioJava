package Questao6;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		Scanner leitor = new Scanner(System.in);
		
			System.out.println("Digite seu salario: ");
			float salario = leitor.nextFloat();
			funcionario.setSalario(salario);
		
			System.out.println("Digite o valor da parcela: ");
			float parcela = leitor.nextFloat();
			funcionario.setPrestacao(parcela);
		
		leitor.close();
		
		funcionario.calculaCredito();
	}
}
