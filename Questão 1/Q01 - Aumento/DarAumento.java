 aumento;

public class DarAumento {
	
	public static void main(String[] args) {
		
		Funcionario bomFuncionario = new Funcionario();
		
		bomFuncionario.setSalario((float) 1700.00);
		bomFuncionario.setAumento((float) 0.05);
		
		System.out.println("O valor do aumento foi: "
				+ (bomFuncionario.getSalario()*bomFuncionario.getAumento())
				+ " e o salario final e de: "
				+ (bomFuncionario.getSalario() + (bomFuncionario.getSalario()*bomFuncionario.getAumento())));
		
	}
	
}
