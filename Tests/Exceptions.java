package LabTest;
import java.util.*;
//import java.lang.*;
import java.lang.annotation.AnnotationTypeMismatchException;

public class Exceptions {
public static void main(String args[])
{
	//divideByZero();
    //arrayOutOfBounds();
	//inputMissMatch();
	nullPointer();
}
	static void divideByZero()
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two no");
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	try 
	{
	   
	   int div=a/b;	
	   System.out.println("The division is "+div);
	}catch(ArithmeticException e)
	{
	System.err.println("Cannot divide by zero");
	}


}

static void arrayOutOfBounds()
{   Scanner sc =new Scanner(System.in);
	int arr[] = new int[] {1,2,3};
	try {
		System.out.println("Enter array index");
		int ind=sc.nextInt();
		System.out.println("The element at index 3 is "+arr[ind]);
	}catch(ArrayIndexOutOfBoundsException ex) {System.err.println("Enter the correct index");}
	
}

static void inputMissMatch()
{   
	Scanner sc =new Scanner(System.in);
	try {
    System.out.println("Enter no");
    int no=sc.nextInt();
    System.out.println("The given no is "+no);
}catch(InputMismatchException ex) {System.err.println("Enter integer value");}
	
}

static void nullPointer()
{   try {
	Object s=null;
	System.out.println("The given value is "+s);
}catch(NullPointerException ex) {System.err.println("Enter integer value");}
	
}

}
