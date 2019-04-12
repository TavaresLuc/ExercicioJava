package Questao8;

public class Pousada {
	public static void main(String[] args) {
		
		Conta lucas = new Conta("Lucas", 8);
		lucas.geraConta();
		Conta alan = new Conta("Alan", 5);
		alan.geraConta();
		Conta.geraLucro();
	}
}
