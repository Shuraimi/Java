import java.util.* ;

import java.io.*;

class Square {

	// Write your code here

	int length;//data member

	//default constructor

	Square() {

		length = 10;

	}

//paramiterised constructor

	Square(int length) {

		length = this.length;

	}

	//function to print area

	void printArea(int length) {

		System.out.println(length * length);

	}

}

class AreaOfSquare {

	public static void main(String args[]) {

		// Write your code here
    //using default constructor 
		Square s1 = new Square();

		s1.printArea(s1.length);
    //using parameterised constructor
		Square s2 = new Square(7);

		s2.printArea(s2.length);

	}

}
