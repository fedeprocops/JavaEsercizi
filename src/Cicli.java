
public class Cicli {

	public static void main(String[] args) {
		//	CICLO WHILE - la condizione è verificata prima  
		
//		int i = 0; 
//		while (i < 5) {
//			System.out.println(i);
//			i++; 
	//	}
		
		//CICLO DO WHILE - esegue prima la condizione e dopo il codice (while)
		
		//int i = 0;
		//while (i < 0) {
			//System.out.println("while " + i);
			//i++; 
		//}
		
		//do {
			//System.out.println("dowhile " + i);
			//i++;
		//} while (i < 0); 
		
		//CICLO FOR - FOR ANNIDATI
		
	//	for(int i = 0; i < 5; i++) {
		//	System.out.println("riga " + i);
		//	for (int j = 0; j < 5; j++) {
		//		System.out.println("colonna " + j);
		//	}
	//	}
		
		//CICLO FOREACH con array
		//int [] numeri = {10, 20, 30, 40, 50};
		//for (int numero: numeri //lista di numero) {
		//	System.out.println(numero); 
		//}
		
		//BREAK E CONTINUE
		 for (int i=0; i<5; i++) {
			 if(i == 4) {
				 break; 
			 } System.out.println(i); 
			 
		 }
		
	}

}
