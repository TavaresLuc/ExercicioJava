package Questao7;

public class Avalia {
	
	public static void main(String[] args) {
			
		Aluno lucas = new Aluno("Lucas", 10, 10);
		Aluno alan  = new Aluno("Alan", 6, 7);
		Aluno carlos = new Aluno("Carlos", 8, 4);
		Aluno gabriel = new Aluno("Gabriel", 7, 8);
		Aluno jose = new Aluno("José", 5, 4);
		Aluno joao = new Aluno("Joao", 6, 8);

		lucas.fazerMedia();
		alan.fazerMedia();
		carlos.fazerMedia();
		gabriel.fazerMedia();
		jose.fazerMedia();
		joao.fazerMedia();
		
		lucas.avalia();
		alan.avalia();
		carlos.avalia();
		gabriel.avalia();
		jose.avalia();
		joao.avalia();
		
		Aluno.informa();
	}
}
