public class DrugPotency {

	public static void main(String[] args) {

		double e=0;
		while (e<50) {
			System.out.println("effectiveness: " + (100-(e*(4/100))));
		} while (e>=50) {
			System.out.println("effectiveness: " + (100-(e*(4/100))) + "DISCARDED");
		}
	}
}		

// for (int i=1; i <=100; i++) {
// 	System.out.println(i);
// }


// }	
// public static int findLength(String str) {
// 	// return the length of str, assume no length method built into string
// 	int length = 0;
// 	for (int i=0; i < str.length(); i++) {
// 		len++;
// 	}
// 	return len;
// }