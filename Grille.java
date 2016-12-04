
public class Grille {
	public static void main(String[] args) {
	char vague = '~';
	char boom = '*';
	char mystere = '?';
	
	int colonne = 10;
	int ligne = 10;
	int i;
	
	//la matrice du jeu
	char matrice [] [] = new char [10][11];
	
	// La ligne des coordonnées
	char titreLigne [] = {' ','A','B','C','D','E','F','G','H','I','J'};
	matrice[0] = titreLigne;
	
	// La colonne des coordonnées
	for	(int a=0; a < matrice.length; a++) {
		
	}
	
	for (int k=0; k < matrice.length ;k++){
		for(int j=0; j < matrice[k].length ;j++){
			System.out.print(matrice[k][j]+" " );
			}
		System.out.println(" ");
		}

	}
}
