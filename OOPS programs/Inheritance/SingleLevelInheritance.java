//single level inheritance program
import java.util.* ;
import java.io.*;

class Car {
	int noOfGear;
	String color;
	// Write your constructor and printCarInfo method here.

	Car(int noOfGear, String color) {
		this.noOfGear = noOfGear;
		this.color = color;
	}
	void printCarInfo() {
		System.out.println("no of gears: " + noOfGear + "\ncolor: " + color);
	}
}

class RaceCar extends Car {


	int maxSpeed;
	// Write your constructor and printRaceCarInfo method here.

	RaceCar(int noOfGear, String color, int maxSpeed) {
		super(noOfGear, color);

		this.maxSpeed = maxSpeed;
	}
	void printRaceCarInfo() {
		System.out.println("noOfGear:" + noOfGear + "\ncolor:" + color);
		System.out.println("maxspeed:" + maxSpeed);
	}
}

class SingleLevelInheritance {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int noOfGear = sc.nextInt();

		// [IGNORE]: Extra "end line" in previous line.
		sc.nextLine();

		String color = sc.nextLine();
		int maxSpeed = sc.nextInt();
		RaceCar raceCar = new RaceCar(noOfGear, color, maxSpeed);
		raceCar.printRaceCarInfo();
	}
}
