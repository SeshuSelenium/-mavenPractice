package Abstraction;

public class Txt {

	String firstName = "Mounika";
	String lastName = "Reddy";

	double parsantage = 99.51;

	int marks = 598;


	public void m1() {
		System.out.println("First name : " + firstName);
		System.out.println("Last name : " + lastName);

	}

	public void m2() {
		System.out.println("per : " + parsantage);

	}

	public void m3() {
		System.out.println("Marks : " + marks);
	}

	public char m4(char g) {

		System.out.println("Gread : " + g);

		return g;
	}

	public static void main(String[] args) {
		Txt t = new Txt();
		t.m1();
		t.m2();
		t.m3();
		t.m4('A');
	}

}
