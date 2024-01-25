/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = (int) (Math.random() * (b - a + 1) + a);
        int d = (int) (Math.random() * (b - a + 1) + a);
        int e = (int) (Math.random() * (b - a + 1) + a);
		int Min = Math.min(Math.min(c,d),e);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println("The minimal generated number was " + Min );
	}
}