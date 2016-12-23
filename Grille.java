import java.util.Scanner;

public class GrilleBis {
	public static void main(String[] args) {
	String vague = "~";
	String boom = "*";
	String mystere = "?";
	int ligne;
	int colonne;
		
	//on demande le nbre de lignes	
	Scanner cs = new Scanner(System.in);
	System.out.println("Sur combien de lignes voulez-vous jouer? (min 10 - max 26)");
	ligne = cs.nextInt();
	//on demande le nbr de colonnes
	System.out.println("Sur combien de colonnes voulez-vos jouer? (min 10 - max 26)");
	colonne = cs.nextInt();		
	
	//la matrice du jeu
	String matrice [] [] = new String [ligne+1][colonne+1];
	
	//On met les étoiles pour toutes les cases
	for (int k=0; k < matrice.length ;k++){
		for(int j=0; j < matrice[k].length ;j++){
			matrice[k][j] = vague;
			}
		}
	
	// La ligne des coordonnées
	String titreLigne [] = {" ","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	//for (int e = 0; e <= colonne ; e++){
	//matrice[0][e] = titreLigne[e];
	matrice[0] = titreLigne;
	//}
	
	// La colonne des coordonnées
	for	(int a=1; a < matrice.length; a++) {
		String c = new String();
		c = String.valueOf(a);		//ValueOf car String parce qu'il y a plus de 10 lignes
		matrice [a][0] = c;
	}
	
	//afficher la matrice
	for (int k=0; k < matrice.length ;k++){
		for(int j=0; j < matrice[k].length ;j++){
			System.out.print(matrice[k][j]+" " );
			}
		System.out.println(" ");
		}
	}
}
