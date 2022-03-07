package herança.downCastUpCast;

public class Main {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		//Upcast -> De uma classe mais específica se cria uma classe mais genérica
		Funcionario faxineiro = new Faxineiro();
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		
		//Downcast -> De uma classe mais genérica se cria uma classe mais específica
		//Dá problema na execução pq a classe genérica não possui todos os atributos necessário. Não é recomendado fazer.
		Gerente gerente1 = (Gerente) new Funcionario();
		
		oooo;
		
	}
}
