package Javaprac.java;

public class array234 {

	public static void main(String[] args) {
		
		// how to store Kids Name
		
		String [] KidsName= {"Subaha","Shathi","Nishi"};
		
		for( String Kidsname:KidsName)
			
			System.out.println(Kidsname);
		
		System.out.println(KidsName[1]);
		
		System.out.println(KidsName.length);
		
		// How to add data flower
		
		String[]FlowerName= {"Jui","Rose","Belly"};
		
		for(String flowername: FlowerName)
			System.out.println(flowername);
		
		// how to replace jui to Shapla

		FlowerName[1]="Shapla";
		
		System.out.println(FlowerName[1]);

		
	}

}
