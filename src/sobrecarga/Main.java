package sobrecarga;

public class Main {
	
	public static void main(String[] args) {
		
		//Area do quadrado
		Quadrilatero.area(3);
		
		//Area do retangulo
		Quadrilatero.area(3d, 5d);
		
		//Area do trapezio
		Quadrilatero.area(3, 5, 2);

		//Area do losango
		Quadrilatero.area(3f, 5f);
	}
	
}
