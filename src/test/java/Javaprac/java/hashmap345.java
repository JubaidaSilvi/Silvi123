package Javaprac.java;

import java.util.HashMap;

public class hashmap345 {

	public static void main(String[] args) {
		
		
		HashMap <String,String> KidsNameDOB= new HashMap <String,String>();
		
		KidsNameDOB.put("Subrina", "12-6-1995");
		KidsNameDOB.put("Saaabrina", "12-7-1990");
		KidsNameDOB.put("Surina", "11-8-1993");
		
		System.out.println(KidsNameDOB.get("Subrina"));
		System.out.println(KidsNameDOB.size());
		
	

	}

}
