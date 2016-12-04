import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		char choix;
		
		System.out.print("\n______       _   _   _        ___      _ ");  
		System.out.print("\n| ___ \\     | | | | | |      |_  |    | |  ");
		System.out.print("\n| |_/ / __ _| |_| |_| | ___    | | ___| |_"); 
		System.out.print("\n| ___ \\/ _` | __| __| |/ _ \\   | |/ _ \\ __|");
		System.out.print("\n| |_/ / (_| | |_| |_| |  __/\\__/ /  __/ |_ ");
		System.out.print("\n\\____/ \\__,_|\\__|\\__|_|\\___\\____/ \\___|\\__|");
		System.out.println("\n\nBienvenue dans notre jeu BATTLEJET!");
		System.out.println("Quel type de partie voulez-vous jouer?(indiquer numéro du choix)");
		System.out.println("\n1. - En réseau");
		System.out.println("\n2. - En local");
		 
		Scanner cs = new Scanner(System.in);
		
		choix = cs.nextLine().charAt(0);
		
		if (choix == '1') {
			System.out.println("Vous avez choisi en réseau");
		}
		else if (choix == '2') {
			System.out.println("Vous aller jouer en local! C'est parti...");
		}
		else {
			System.out.println("Erreur de choix!");			
		}
		
                                           
                                           


	}

}
