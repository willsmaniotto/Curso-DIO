package Interface;

public class Calculadora implements OperacaoMatematica{
	
	//Ao implementar uma interface � obrigat�rio implementar todos os metodos que est�o definidos na interface
	
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
