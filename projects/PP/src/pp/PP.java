
import java.util.Scanner;


public class PP {

	public static void main(String[] args) {
		String password; 
		String userInput;
		boolean found = false;
		int tries = 0;
		password = "geheim";
		
		do {
                    // Scanner deklarieren und initialisieren	
                    // Deklaration 
                    Scanner raja; 
                    // Initialisierung
                    raja = new Scanner(System.in);
                    
                    userInput = raja.nextLine();
                    
                    // Identiätsoperator <-> Äquivalenzfunktion equals
                    if (userInput == password) { 
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                    
		} while ( tries < 3 && !found);
		// de-Morgan: !(tries > 3 || found)
	
	}
}
