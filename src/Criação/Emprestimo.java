package Cria��o;

public class Emprestimo {
	
	public static void calcular(double valor, int parcelas) {
		
		if(parcelas == 2) {
			
			System.out.println("O valor final do empr�stimo �: " + (valor + (valor * 0.2)));
			
		}else if(parcelas == 3) {
			
			System.out.println("O valor final do empr�stimo �: " + (valor + (valor * 0.4)));
			
		}else {
			
			System.out.println("O n�mero de parcelas � inv�lido");
			
		}
	}
	
	
}
