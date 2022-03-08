package Interface;

public class Calculadora implements OperacaoMatematica{
	
	//Ao implementar uma interface é obrigatório implementar todos os metodos que estão definidos na interface
	
	@Override
	public void soma(double operador1, double operador2) {
		System.out.println("Soma: " + (operador1 + operador2));
	}
	
	@Override
	public void subtracao(double operador1, double operador2) {
		System.out.println("Soma: " + (operador1 - operador2));
	}
	
	@Override
	public void multiplicacao(double operador1, double operador2) {
		System.out.println("Soma: " + (operador1 * operador2));
	}
	
	@Override
	public void divisao(double operador1, double operador2) {
		System.out.println("Soma: " + (operador1 / operador2));
	}

}
