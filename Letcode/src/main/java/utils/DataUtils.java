package utils;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider()
private String[][] getdata() {
		 String[][] data= new  String[3][2];
		 
		 data[0][0]= "priyavinu92@gmail.com";
		 data[0][1]= "Passw0rd$";
				 
		 data[0][0]= "priyaavinuu92@gmail.com";
		 data[0][1]= "Passw0rd$";
		 
		 data[0][0]= "priyankaprabu2623@gmail.com";
		 data[0][1]= "Passw0rd$";
				 return data;
}
}
