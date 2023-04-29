/*
TITLE:
Complementary DNA

DESCRIPTION:
Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.
In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one side of the DNA (string, except for Haskell); you need to return the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

Example: (input --> output)
"ATTGC" --> "TAACG"
"GTAT" --> "CATA"
*/

public class ComplementaryDNA {
	public static String makeComplement(String dna) {
		
		// creating a string to hold the result:
		String complement = "";
		// iterating the argument string:
		for (int i = 0; i < dna.length(); i++) {
			// adding the correspondent character to the new string:
			switch (dna.charAt(i)) {
				case 'A': {complement += 'T'; break;}
				case 'T': {complement += 'A'; break;}
				case 'G': {complement += 'C'; break;}
				case 'C': {complement += 'G'; break;}
			}
		}
		return complement;
	}
}
