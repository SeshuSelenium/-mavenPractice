package dummy;

public class DummyPractice {

	public static void main(String[] args) {

		String str = "nagasesha123@@@";
		for (int i = 0; i < str.length(); i++) {
		
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				System.out.println(str.charAt(i)+" : is charecter " );
			}else if(str.charAt(i)>='0'&& str.charAt(i)<='9') {
				System.out.println(str.charAt(i)+" : is numaric ");
			}else {System.out.println(str.charAt(i)+" : is symble");}
		}
		
	}

}
