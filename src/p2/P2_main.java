package p2;

public class P2_main {
	public static void main (String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 0;
		
		
	if (d==0){
		if (a==b) {
			d++;
		}
		if (a==b) {
			d++;
		} else if (a==c) {
			d++;
		}
		if (a+b>=c) {
			d++;
		}
		if (a+b+c>=100) {
			d++;
		} 
		
	} else {
			d=0;
		}
		
		System.out.println(d);
		
	}
}
