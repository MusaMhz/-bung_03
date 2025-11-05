package h3;

public class H3_main {
	public static void main (String [] args) {
		
		int max = 5;
		int fix = 2;
		int wartend = 2;
		boolean istVoll;
		
		if (fix < max && wartend > 0) {
			int freierPlatz = max - fix;
			int neuerPlatz = Math.min(freierPlatz, wartend);
			
			fix += neuerPlatz;
			wartend -= neuerPlatz;
		}
		
		if (max == fix) {
			istVoll = true;
		} else {
			istVoll = false;
		}
		
		System.out.println("Fixplätze vergeben: " + fix);
        System.out.println("Noch wartend: " + wartend);
        System.out.println("Ist voll: " + istVoll);
	}

}
