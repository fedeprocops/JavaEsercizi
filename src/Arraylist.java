import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		//ArrayList<String> persone = new ArrayList<String>(); 
		
		//Per aggiungere elementi 
		//persone.add("Luca"); 
		//persone.add("Marco"); 
		//persone.add("Anna"); 
		
		//For con ArrayList
		//for(int i = 0; i < persone.size(); i++) {
		//System.out.println(persone.get(i)); 
		
		
		//Modificare gli elementi
		//persone.set(2, "Paola");
		//System.out.println(persone.get(i)); 
		//}
		
		//Rimuovere gli elementi
		//persone.remove(0); //Rimuove Luca
		
		//Clear - pulisce l'array
		
		//persone.clear(); 
		
		//E' possibile utilizzare le Wrapper class
		
		// ArrayList<Integer> persone = new ArrayList<Integer>(); 
	//	persone.add(1); 
	//	persone.add(100);
	//	persone.add(1000);
		
	//	for (int i = 0; i < persone.size(); i++) {
	//		System.out.println(persone.get(i)); 
			
	//	}
		
		//ARRAYLIST 2D : ARRAYLIST DI ARRAYLIST
	
		ArrayList<ArrayList<String>> classi = new ArrayList(); 
	
		ArrayList<String> classe1 = new ArrayList<String>();
		classe1.add("Luca");
		classe1.add("Marco");
		
		ArrayList<String> classe2 = new ArrayList<String>(); 
		classe2.add("Anna");
		classe2.add("Lucia"); 
		
		classi.add(classe1);
		classi.add(classe2); 
		
		for (int i = 0; i <classi.size(); i++) {
			System.out.println(); 
		for (int j = 0; j < classi.get(i).size(); j++) {
			System.out.println(classi.get(i).get(j) + ""); 
		}
		}
		
	}

}
