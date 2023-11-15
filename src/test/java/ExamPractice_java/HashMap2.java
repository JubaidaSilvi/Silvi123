package ExamPractice_java;

import java.util.HashMap;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap<String,String> NameDOB=new HashMap<String,String>();
		NameDOB.put ("Silvi","12-8-1990");
		NameDOB.put("Subaha","12-26-2012");
		NameDOB.put("Akash","12-4-1998");
		
		{System.out.println(NameDOB);}
		// how to access data
		{System.out.println(NameDOB.get("Subaha"));}
		
		// how to remove
		NameDOB.remove("Silvi");
		
		NameDOB.clear();
	}

}
