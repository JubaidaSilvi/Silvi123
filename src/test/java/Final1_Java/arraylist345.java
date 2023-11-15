package Final1_Java;

import java.util.ArrayList;

public class arraylist345 {

	public static void main(String[] args) {
		 
		ArrayList <String> KidsName= new ArrayList <String>();
		
		KidsName.add("Katie");
		KidsName.add("Subaha");
		KidsName.add("Nabeeha");
		
		System.out.println(KidsName.get(1));
		
		System.out.println(KidsName.set(1, "Tamanna"));
		
		System.out.println(KidsName.get(1));
		
		System.out.println(KidsName.size());
	}

}
