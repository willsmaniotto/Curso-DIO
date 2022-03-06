package retornos;

public class Main {

	public static void main(String[] args) {
		
		//Area do quadrado
		System.out.println("A área do quadrado é: " + Quadrilatero.area(3));
		
		//Area do retangulo
		System.out.println("A área do retangulo é: " + Quadrilatero.area(3d, 5d));
		
		//Area do trapezio
		System.out.println("A área do trapézio é: " + Quadrilatero.area(3, 5, 2));

		//Area do losango
		System.out.println("A área do losango é: " + Quadrilatero.area(3f, 5f));

	}

}
