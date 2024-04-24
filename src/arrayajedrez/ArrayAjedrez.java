package arrayajedrez;

public class ArrayAjedrez {

	public static void main(String[] args) {

		String[][] Tablero = new String[8][8];
		

		for (int i = 0; i < Tablero.length; i++) {
			for (int j = 0; j < Tablero.length; j++) {
				if (j == 1 || j == 6) {
					Tablero[i][j] = "Peon";
				} else if ((i == 0 || i == 7) && (j == 0 || j == 7)) {
					Tablero[i][j] = "Torre";
				} else if ((i == 1 || i == 6) && (j == 0 || j == 7)) {
					Tablero[i][j] = "Caballo";
				} else if ((i == 2 || i == 5) && (j == 0 || j == 7)) {
					Tablero[i][j] = "Alfil";
				} else if (i == 3 && (j == 0 || j == 7)) {
					Tablero[i][j] = "Reina";
				} else if (i == 4 && (j == 0 || j == 7)) {
					Tablero[i][j] = "Rey";
				} else if ((i >= 0 && i <= 7) && (j >= 2 && j <= 5)) {
					Tablero[i][j] = " ";
				}
			}
		}
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(Tablero[i][j] + "\t");

			}
			System.out.println(" ");
		}
	}

}
