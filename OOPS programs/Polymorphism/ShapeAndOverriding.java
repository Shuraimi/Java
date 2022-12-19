//polymorphism program
import java.util.* ;
import java.io.*;

// Create the classes here

class Shape {
	String shapeType;
	void printMyType() {
	}
}
class Square extends Shape {
	int length;
	Square(int length) {
		this.length = length;
	}
	int calculateArea() {
		return length * length;
	}
	void printMyType() {
		System.out.println("I'm a Square");
	}
}
class Rectangle extends Shape {
	int length;
	int breadth;
	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	int calculateArea(int length, int breath) {
		return length * breadth;
	}
	void printMyType() {
		System.out.println("I'm a Rectangle");
	}
}
class Solution {

	public static void main(String args[]) {

		// Write your code here

		Square s = new Square(5);
		s.printMyType();
		System.out.println(s.calculateArea());
		Rectangle r = new Rectangle(5, 4);
		r.printMyType();
		System.out.println(r.calculateArea(5, 4));

	}
}
