package retornos;

public class Main {

	public static void main(String[] args) {
		
		//Area do quadrado
		System.out.println("A �rea do quadrado �: " + Quadrilatero.area(3));
		
		//Area do retangulo
		System.out.println("A �rea do retangulo �: " + Quadrilatero.area(3d, 5d));
		
		//Area do trapezio
		System.out.println("A �rea do trap�zio �: " + Quadrilatero.area(3, 5, 2));

		//Area do losango
		System.out.println("A �rea do losango �: " + Quadrilatero.area(3f, 5f));

	}

}
