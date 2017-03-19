package cc;
import java.util.Scanner;
import java.*;
public class Ew {
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
   String a;
   int i,d=0,al=0,sy=0;
   a=s.nextLine();
   for(i=0;i<a.length();i++){
	   if(Character.isDigit(a.charAt(i))){
		   d++; }
		   else {
			if(Character.isAlphabetic(a.charAt(i))){
				   al++;
			   }else{
				   sy++;}
			   }
	  
		   
   }
   System.out.println("dig="+d+"\nalp="+al+"\nsym="+sy);
   
}}