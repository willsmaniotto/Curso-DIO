package heran�a.polimorfismoSobrescrita;

public class Main {
	
	public static void main(String[] args) {
		
		ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
		
		//Existe polimorfismo porque na declara��o a gente usa a ClasseMae e m�todo acaba tentdo o comportamento da ClasseFilha
		for(ClasseMae classe : classes){
			classe.metodo1();
		}
		
		System.out.println("");		
		
		//Existe polimorfismo porque na declara��o a gente usa a ClasseMae e m�todo acaba tentdo o comportamento da ClasseFilha
		for(ClasseMae classe : classes){
			classe.metodo2();
		}
		
		System.out.println("");		
		
		//N�O existe polimorfismo porque na declara��o a gente usa a ClasseFilha e o m�todo apenas sobrescreve o m�todo da ClasseMae
		ClasseFilha2 classeFilha = new ClasseFilha2();
		classeFilha.metodo2();
		
		
	}

}
