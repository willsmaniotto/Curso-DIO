package Criação;

public class Emprestimo {
	
	public static void calcular(double valor, int parcelas) {
		
		if(parcelas == 2) {
			
			System.out.println("O valor final do empréstimo é: " + (valor + (valor * 0.2)));
			
		}else if(parcelas == 3) {
			
			System.out.println("O valor final do empréstimo é: " + (valor + (valor * 0.4)));
			
		}else {
			
			System.out.println("O número de parcelas é inválido");
			
		}
	}
	
	
}
