package Questao4;

import java.util.Scanner;

public class VerificaFuncionario {
	

	public static void main(String[] args) {
		
		Funcionario assalariado = new Funcionario();
		Scanner lerSalario = new Scanner(System.in);
		Scanner lerNome = new Scanner(System.in);
		
		String nome = ".";
		
		while(!nome.equals("fim")) {
			
			System.out.println("Digite o nome do funcionario: ");
			nome = lerNome.nextLine();
			assalariado.setNome(nome);
			
			System.out.println("Digite o salario: ");
			float salario = lerSalario.nextFloat();
			assalariado.setSalario((float) salario);
			
				if (assalariado.getSalario() < 500) {
					System.out.println("O novo salario � de: "
					+ (assalariado.getSalario() + (assalariado.getSalario()*.20)));
				}
				else {
					System.out.println("O ajuste n�o � necess�rio.");
				}	
		}
		lerNome.close();
		lerSalario.close();
	}
}
