package Final1_Java;

import java.util.ArrayList;

public class araylist1111 {

	public static void main(String[] args) {
		
		// Syntax ArrayList <String >name = new ArrayList<String>();
		
		ArrayList <String> FruitsName= new ArrayList<String>();
		
		FruitsName.add("Apple");
		FruitsName.add("Mango");
		FruitsName.add("Bananna");
		
		// How to access
		
		FruitsName.get(0);
		System.out.println(FruitsName.get(0));
		
		FruitsName.set(0, "Orange");
		
		 System.out.println(FruitsName.get(0));
		
		

	}

}
