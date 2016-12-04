
public class Grille {
	public static void main(String[] args) {
	String vague = "~";
	String boom = "*";
	String mystere = "?";
		
	//la matrice du jeu
	String matrice [] [] = new String [10][11];
	
	//On met les étoiles pour toutes les cases
	for (int k=0; k < matrice.length ;k++){
		for(int j=0; j < matrice[k].length ;j++){
			matrice[k][j] = vague;
			}
		}
	
	// La ligne des coordonnées
	String titreLigne [] = {" ","A","B","C","D","E","F","G","H","I","J"};
	matrice[0] = titreLigne;
	
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