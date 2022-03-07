package herança.polimorfismoSobrescrita;

public class Main {
	
	public static void main(String[] args) {
		
		ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
		
		//Existe polimorfismo porque na declaração a gente usa a ClasseMae e método acaba tentdo o comportamento da ClasseFilha
		for(ClasseMae classe : classes){
			classe.metodo1();
		}
		
		System.out.println("");		
		
		//Existe polimorfismo porque na declaração a gente usa a ClasseMae e método acaba tentdo o comportamento da ClasseFilha
		for(ClasseMae classe : classes){
			classe.metodo2();
		}
		
		System.out.println("");		
		
		//NÃO existe polimorfismo porque na declaração a gente usa a ClasseFilha e o método apenas sobrescreve o método da ClasseMae
		ClasseFilha2 classeFilha = new ClasseFilha2();
		classeFilha.metodo2();
		
		
	}

}
