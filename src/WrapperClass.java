
public class WrapperClass {

	public static void main(String[] args) {
		
		//WRAPPER CLASS è un metodo che attribuisce ai dati primitivi le proprietà dei dati reference (INBOXING & OUTBOXING)
		
		Boolean vero = true; 
		Character carattere = 'a'; 
		Integer numero = 5; 
		Double virgola = 5.3; 

		boolean a = true; 
		char b = 'a';
		int c = 5; 
		double d = 5.23; 
		
		if(vero == a) { //se true = true 
			System.out.println("ciao"); 
		}
	}

}
