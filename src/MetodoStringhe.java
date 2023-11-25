
public class MetodoStringhe {

	public static void main(String[] args) {
		
		String nome = "Leonardo"; 
		
		//boolean risultato = nome.equals("Leonardo"); - EQUALS restituisce un boolean (case sensitive)
		
		//boolean risultato = nome.equalsIgnoreCase("Leonardo"); - EQUALSIGNORECASE risolve il problema di equals
		
		//int risultato = nome.length(); - LENGTH restituisce la lunghezza della stringa
		 
		//char risultato = nome.charAt(4); - charAt - restituisce alla posizione numerica il carattere di riferimento

		//int risultato = nome.indexOf("a"); - INDEX OF - restituisce al carattere la posizione della lettera
	 	
		//boolean risultato = nome.isEmpty(); - ISEMPTY - booleano da usare quando la stringa è vuota
		
		//String risultato = nome.toUpperCase(); - TOUPPERCASE - tutto in maiuscolo
		
		// String risultato = nome.toLowerCase(); -TOLOWERCASE tutto in minuscolo
		
		//TRIM - rimuove gli spazi avanti e indietro
		
		String risultato = nome.replace('e', 'i'); // REPLACE - cambia il carattere selezionato con un altro
		System.out.println(risultato);	
		
		
		
		
	}

}
