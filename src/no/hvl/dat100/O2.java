package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {

		int inntekt = parseInt(showInputDialog("Skriv inntekt: "));

		if (inntekt > 0) {
			if (inntekt < 208050) {
				System.out.println("Ingen trinnskatt");
			} else if (208051 <= inntekt && inntekt <= 292850) {
				System.out.println("Trinn 1");
				System.out.println("Betal: " + inntekt * 0.017 + " kr");
			} else if (292851 <= inntekt && inntekt <= 670000) {
				System.out.println("Trinn 2");
				System.out.println("Betal: " + inntekt * 0.04 + " kr");
			} else if (670001 <= inntekt && inntekt <= 937900) {
				System.out.println("Trinn 3");
				System.out.println("Betal: " + inntekt * 0.136 + " kr");
			} else if (937901 <= inntekt && inntekt <= 1350000) {
				System.out.println("Trinn 4");
				System.out.println("Betal: " + inntekt * 0.166 + " kr");
			} else if (1350000 <= inntekt) {
				System.out.println("Trinn 5");
				System.out.println("Betal: " + inntekt * 0.176 + " kr");
			} else {
				System.out.println("Ugyldig inntekt");
				inntekt = parseInt(showInputDialog("Skriv inntekt på nytt: "));
			}
		}
	}
}
