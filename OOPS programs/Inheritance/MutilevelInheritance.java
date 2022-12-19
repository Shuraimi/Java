import java.util.*;
class GrandFather {
	String grandFatherName;
	//default constructor

	GrandFather() {
		System.out.println("GrandFather constructor called");
	}
	GrandFather(String grandFatherName) {
		this.grandFatherName = grandFatherName;
	}
}
class Father extends GrandFather {
	String fatherName;
	//String grandFatherName;
	Father() {
		System.out.println("Father co structor called");
	}
	Father(String grandFatherName, String fatherName) {
		super(grandFatherName);
		this.fatherName = fatherName;
	}
}
class Son extends Father {
	String sonName;
	//String fatherName;
	//String grandFatherName;
	Son() {
		System.out.println("Son constructor called");
	}
	Son(String grandFatherName, String fatherName, String sonName) {
		super(grandFatherName, fatherName);
		this.sonName = sonName;
	}
	void printInfo() {
		System.out.println("sonname: " + sonName);
		System.out.println("fathername: " + fatherName);
		System.out.println("grandfathername: " + this.grandFatherName);
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter grandfather's name");
		String gf = sc.nextLine();
		System.out.println("Enter father's name");
		String f = sc.nextLine();
		System.out.println("Enter son's name");
		String so = sc.nextLine();
		Son s = new Son(gf, f, so);
		//Son s=new Son();
		s.printInfo();
	}
}
