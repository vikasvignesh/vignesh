package cc;
import java.util.Scanner;
import java.*;
public class Ew {
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
 int sum=0,v,i;
 System.out.println("Enter a number to sum");
 v=s.nextInt();
 if(v<0){
	 System.out.println("Entered number is negative"+v);
 }
 for(i=0;i<=v;i++){
	 sum+=i;
 }
   System.out.println(sum);
}}