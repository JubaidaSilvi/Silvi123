package Javaprac.java;

import java.util.ArrayList;

public class pracArraylist {

	public static void main(String[] args) {
		// Array List 
		  // Syntax of Arraylist
			
			//ArrayList<Datatype> variable name= new ArrayList <Datatype>();
			
			ArrayList <String> KidsName= new ArrayList <String>();
			
			// Add kids name in Arraylist
			
			KidsName.add("Santa");
			KidsName.add ("Sathi");
			KidsName.add("Tony");
			
			{System.out.println(KidsName.get(0));}
			
			// Change Arraylist data 
			{System.out.println(KidsName.set(0, "Tamanna"));}
			{System.out.println(KidsName.get(0));}

	}

}
