package heran�a.downCastUpCast;

public class Main {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		//Upcast -> De uma classe mais espec�fica se cria uma classe mais gen�rica
		Funcionario faxineiro = new Faxineiro();
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		
		//Downcast -> De uma classe mais gen�rica se cria uma classe mais espec�fica
		//D� problema na execu��o pq a classe gen�rica n�o possui todos os atributos necess�rio. N�o � recomendado fazer.
		Gerente gerente1 = (Gerente) new Funcionario();
		
		oooo;
		
	}
}
