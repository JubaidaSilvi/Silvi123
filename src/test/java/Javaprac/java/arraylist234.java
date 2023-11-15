package Javaprac.java;

import java.util.ArrayList;

public class arraylist234 {

	public static void main(String[] args) {
		// syntax of Arraylist
		// Arraylist <>variable name =new Arraylist ();
		
		ArrayList <String> KidsName= new ArrayList <String> ();
		
		KidsName.add("Subrina");
		KidsName.add("Tania");
		
	for(String kidsname:KidsName)
		System.out.println(kidsname);
	
	System.out.println(KidsName.get(1));
	
	System.out.println(KidsName.size());
// How to replace the data 
	
	System.out.println(KidsName.set(1,"Akash"));
	
	System.out.println(KidsName.get(1));
	}

}
