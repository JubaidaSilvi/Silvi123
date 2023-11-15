package Javaprac.java;

import java.util.HashMap;

public class hashmpprac {

	public static void main(String[] args) {
		HashMap<String,String>NameDOB=new HashMap<String,String>();
		
		// Add paired value by using HashMap
		
		NameDOB.put("Subrina","12-8-1990");
		NameDOB.put("Sathi", "8-10-1980");
		NameDOB.put("Shima", "1-2-2020");
		
		{System.out.println(NameDOB.get("Subrina"));}

	}

}
