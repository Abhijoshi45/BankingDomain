package com.facebook.Utilities;

import org.testng.annotations.DataProvider;

public class FeatchData {
	
	@DataProvider(name = "data")
	public static Object[][] getData(){
		
		Object data [][] = new Object[4][2];
		
		// 1st set 
		data[0][0] = "abhishekjoshi@gmail.com";
		data[0][1] = "abcd@123";
		
		// 2nd set 
		data[1][0] = "abhishekjoshi@yahoo.com";
		data[1][1] = "xyz@3654";
		
		// 3rd set 
		data[2][0] = "abhishekjoshi@jsjisi.com";
		data[2][1] = "hdgh@89754";
		
		// 4th set 
		data[3][0] = "8955445221";
		data[3][1] = "kjsj@kkm";
		
		return data;
	}

}
