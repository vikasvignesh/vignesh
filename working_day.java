package cc;
import java.awt.im.InputContext;
import java.util.Scanner;
import java.*;
public class Ew {
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
String working;
working=s.nextLine();
String day="sunday";
if(day.equalsIgnoreCase(working)){
	System.out.println("Workingday("+working+")-->False");
}else{
	if(working.equalsIgnoreCase("monday")||working.equalsIgnoreCase("tuesday")||working.equalsIgnoreCase("wednesday")||working.equalsIgnoreCase("thrusday")||working.equalsIgnoreCase("friday")||working.equalsIgnoreCase("saturday"))
	System.out.println("Workingday("+working+")-->True");
	else
		System.out.println("Invalid day");
}
}}
