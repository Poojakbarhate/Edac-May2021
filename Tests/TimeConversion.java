package LabTest;
import java.util.*;
interface Time
{
	void dispTime_InSec(int min);
	void dispTime_InHrs(int min);
}

class TimeCon implements Time
{
	public void dispTime_InSec(int min)
	{
	  int sec=min*60;
	  System.out.println("The time in seconds are "+sec);
	}
	public void dispTime_InHrs(int min)
	{
		float hr=(float)min/60;
		System.out.println("The time in hours are "+hr);
	}
}
public class TimeConversion {
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		TimeCon t=new TimeCon();
		System.out.println("Enter the minutes");
		int min=sc.nextInt();
		t.dispTime_InHrs(min);
		t.dispTime_InSec(min);


}
}
//Nisha.edac@gmail.com
