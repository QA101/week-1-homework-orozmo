
public class DivisibleProgram {

	/*
	 * Define a program that determines whether a number x is divisible by a number y.
	 * 
	 * If x is divisble by y, the program will print TRUE otherwise FALSE
	 * 
	 * Such as:
	 * x -> 10
	 * y -> 5
	 * 10 divided by 5 is 2 with 0 remainder. The program would print true
	 */
	public static void main(String args[]){
		
		int n1 = 5;
        int n2 = 10;
        for (int i = n1; i < n2; i++) {
            if (((i & 1) == 0)) {
                if (i % 3 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
	}
}
