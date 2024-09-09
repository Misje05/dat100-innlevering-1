package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("Velg n: "));
		int sum = 1;
		
		if (n > 0) {
			for (int i = 1; i < n; i++) {
				sum = sum * i;
				
			}
			System.out.println(sum);
		} else {
			System.out.println("Ugyldig input.");
			n = parseInt(showInputDialog("Velg n: "));
		}
	}
}
