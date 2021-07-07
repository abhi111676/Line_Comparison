import java.util.Scanner;

public class CartesianSystem {

	public static void main(String[] args) {
		// variables
		int x1, y1, x2, y2;
		try (// input
				Scanner obj = new Scanner(System.in)) {
			System.out.print("Enter a 1st co-ordinate of x-axis : ");
			x1 = obj.nextInt();
			System.out.print("Enter a 1st co-ordinate of y-axis : ");
			y1 = obj.nextInt();
			System.out.print("Enter a 2nd co-ordinate of x-axis : ");
			x2 = obj.nextInt();
			System.out.print("Enter a 2nd co-ordinate of y-axis : ");
			y2 = obj.nextInt();
		}
		System.out.println("End Points of a Line Segment are = " + "(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")");

		double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length of a Line Segment = " + length);
	}
}
