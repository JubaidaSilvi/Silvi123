package ExamPractice_java;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArraylist {

	private static final String Babies = null;

	public static void main(String[] args) {
		// print even number between 0 to 10
		for(int x=0; x<=10; x+=2)
		{System.out.println(x);}
		
		// Add odd number between 2 to 10 
		for(int y=1; y<10; y+=2)
		{System.out.println(y);}
		
		// store kids name 
		//Syntax
	String[]KidName= {"Subaha","Nabeeha","Akash","Ayesha"};
	for(String kids:KidName)
	{System.out.println(kids);}
	
	// how to store flower name 
	
	String[] flowers= {"Joba","Belly","Rose"};
	for(String flower: flowers)
	{System.out.println(flower);}
	
	// how to change flower name joba to jesmin
	
	flowers[0]="jesmin";
	{System.out.println(flowers[0]);}
	// how to print the length of array
	
	{System.out.println(flowers.length);}
	
	// Arraylist not fixed we can add more data 
	
	//{syntax}
	ArrayList<String>baby= new ArrayList <String>();
	
	baby.add("Tanisha");
	baby.add("Subrina");
	baby.add("Sushan");
	baby.add("Ashiq");
	{System.out.println(baby);}
	
	// To replace the baby Tanisha to Tamanna by usuing Arraylist
	
	baby.set(0, "Tamanna");
	{System.out.println(baby.get(0));}
	
	//  baby.set(0, "Tamanna"); // Replace the element at index 0
    System.out.println(baby.get(0)); // Print the element at index 0
    
    
// how to access baby 
	baby.get(0);
	{System.out.println(baby.get(1));}
	
	// how to remove 
	baby.remove(1);
	// how to clear
	baby.clear();
	// how to check the size
	baby.size();
	
	// for loop array list 
	
	//for loop arraylist
	
	ArrayList <String> school=new ArrayList<String>();
	school.add("Girls");
	school.add("Boys");
	
	for(int s=0; s<school.size();s++)
                                        
	{
		System.out.println(school.get(s));}
	
	
	
     }
	}


