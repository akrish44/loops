public class Loops {

	public static void main(String[] args) {
		String s = "My String";
		int length = findLength(s);
		System.out.println(length);
		

		// int x = 1;
		// while (x <= 100) {
		// 	System.out.println(x); 
		// 	x++; //(x+1)
		// }
		// for (int i=1; i <=100; i++) {
		// 	System.out.println(i);
		// }

		int x = 45;
		while (x>=20) {
			System.out.println(x);
			x=x-5;
		}

		// for (int i=45; i <=68; i+=2) {
		// 	System.out.println(i);
		// }

		// after
	}	
	public static int findLength(String str) {
		// return the length of str, assume no length method built into string
		int length = 0;
		for (int i=0; i < str.length(); i++) {
			len++;
		}
		return len;
	}
}