
public class Array {

	public static void main(String[] args) {
		
		//CREAZIONE DI UN ARRAY - ARRAY VUOTO E ASSOCIAZIONE DEGLI ELEMENTI
		//int[] numeri = new int[3]; 
		//numeri[0] = 10; 
		//numeri[1] = 20; 
		//numeri[2] = 30;
		
		//LUNGHEZZA ARRAY - quantità degli elementi ppresenti nell'array
		//System.out.println(numeri.length);  
		
		//STAMPA DEL SINGOLO ARRAY PARTENDO DALL'INDICE 
		//System.out.println(numeri[2]); 
		
		// ALTRO METODO
	//	int[] numeri = {10, 20, 30, 40};
	 	//System.out.println(numeri[1]);  
	 	
	 	//CICLO FOR (ITERAZIONE DELL'ARRAY)
	// 	for(int i = 0; i < numeri.length; i++) {
	// 		System.out.println(numeri[i]); 
	 //	}
	 	
	 	// FOREACH 
	 	
	// 	for(int numero:numeri ) {
	 //		System.out.println(numero); 
	// 	}
	 	
		
		
		//ARRAY 2D O MULTIDIMENSIONALI O ARRAY DI ARRAY
		
		//nel primo array inseriamo le classi, nel secondo inseriamo il numero di studenti
		
	//	String[][] classi = new String[3][3]; //dichiarazione di un'array
		
	//	classi[0][0] = "Luca";
	//	classi[0][1] = "Anna"; 
	//	classi[0][2] = "Marco";
		
	//	classi[1][0] = "Edoardo";
	//	classi[1][1] = "Leonardo";
	//	classi[1][2] = "Antonio";
		
	//	classi[2][0] = "Arianna";
	//	classi[2][1] = "Paolo";
	//	classi[2][2] = "Andrea";
		
	//	classi[2][1] = "Orazio"; // modifico il contenuto , dopo la dichiarazione
		
	//	System.out.println(classi[2][1]); 
		
	//	for(int classe = 0; classe < classi.length; classe++) {
	//		System.out.println(); 
	//		for(int studente = 0; studente < classi[classe].length; studente++) {
	//			System.out.println(classi[classe][studente] + ""); 
	//		}
	//	}
		
		//Altro metodo
		String [][] classi = {
				{"Luca", "Anna", "Marco"}, 
				{"Edoardo", "Leonardo","Antonio"}, 
				{"Arianna","Paolo", "Andrea"},
		}; 

 
	}

}
