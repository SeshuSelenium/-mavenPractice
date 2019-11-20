package getdataFromExcell;

import lib.ExcellDataComplig;

public class ReadDataFromExcell {

	public static void main(String[] args) {
		
		ExcellDataComplig excel = new ExcellDataComplig("C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\MavenPractice\\cradetials\\facebook.xlsx");
		
		System.out.println(excel.getData("A", 1, 0));
	}

}
