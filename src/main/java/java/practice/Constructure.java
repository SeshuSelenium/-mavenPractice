package java.practice;

public class Constructure {
	int id;
	String name;
	static String company = "IBM";
	public Constructure(int id, String name) {
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {
		Constructure c = new Constructure(101, "seshu");
		System.out.println(c.id);
		System.out.println(c.name);

	}

}
