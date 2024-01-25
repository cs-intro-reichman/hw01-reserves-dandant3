/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int quarters = a / 25;
		int divMult = quarters * 25;
        int Cents = a - divMult;

            // Print the result
            System.out.println("Use " + quarters + " quarters and " + Cents + " cents");
        }
}