package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			int poeng = parseInt(showInputDialog("Skriv poengsum: "));

			if (101 > poeng && poeng > 0) {
				if (100 >= poeng && poeng >= 90) {
					System.out.println("A");
				} else if (89 >= poeng && poeng >= 80) {
					System.out.println("B");
				} else if (79 >= poeng && poeng >= 60) {
					System.out.println("C");
				} else if (59 >= poeng && poeng >= 50) {
					System.out.println("D");
				} else if (49 >= poeng && poeng >= 40) {
					System.out.println("E");
				} else if (39 >= poeng && poeng >= 0) {
					System.out.println("F");
				}
			} else {
				System.out.println("Ugyldig poengsum");
				poeng = parseInt(showInputDialog("Skriv poengsum på nytt: "));
			}
		}
	}
}
