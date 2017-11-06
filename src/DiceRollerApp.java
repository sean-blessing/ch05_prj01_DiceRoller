

import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Dice Roller\n");
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			int d1 = roll();
			int d2 = roll();
			
			System.out.println("Die 1:  "+d1);
			System.out.println("Die 2:  "+d2);
			System.out.println("Total:  "+(d1+d2));
			
			if (isSnakeEyes(d1, d2))
				System.out.println("Snake eyes!");
			else if (isBoxCars(d1, d2))
				System.out.println("Box cars!");
			System.out.println();

			System.out.print("Roll again?");
			choice = sc.next();
			System.out.println();
		}
		sc.close();
		System.out.println("Bye!");

	}
	
	public static int roll() {
		int roll = (int)(Math.random()*6)+1;
		return roll;
	}
	
	public static boolean isSnakeEyes(int d1, int d2) {
		if (d1==1 && d2==1)
			return true;
		else 
			return false;
	}

	public static boolean isBoxCars(int d1, int d2) {
		if (d1==6 && d2==6)
			return true;
		else 
			return false;
	}
}
