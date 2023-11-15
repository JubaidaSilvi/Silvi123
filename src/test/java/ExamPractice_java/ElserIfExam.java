package ExamPractice_java;

public class ElserIfExam {

	public static void main(String[] args) {
		// Declare some variables name based on data type and print 
		int Id=123;
		int RollNumber=100;
		String kidsName="Silvi";
		{System.out.println(RollNumber);}
		{System.out.println(Id);}
		
		{System.out.println("kidsName");}
		
		System.out.println("RollNumber: " + RollNumber + ", Id: " + Id + ", kidsName: " + "kidsName");

		// If statement 
		
		int x= 30;
		int y=15;
		int z=x*y;
		
		if (x>y)
		{System.out.println(z);}
		
		// else if condition
		int k= 30;
		int p=15;
		int s=k-p;
		
		if (p>k)
		{System.out.println(s);}
		else
		{System.out.println(s-3);}
		
		////grade system practice
		int testscore=90;
		char grade;
		
		if (testscore>=90)
		{grade= 'A';}
		
		else if 
		(testscore>=80)
		{grade= 'B';}
			
		else if 
		(testscore>=70)
		{grade= 'C';}
			
		else {grade='F';}
		
		{System.out.println("grade="+grade);}
		
		
		
	}

}
