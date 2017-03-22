package cc;
import java.util.Scanner;
import java.*;
public class Ew {
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
int v1,v2,temp;
v1=s.nextInt();
v2=s.nextInt();
System.out.println("before swaping v1= "+v1+" v2= "+v2);
temp=v1;
v1=v2;
v2=temp;
System.out.println("After swaping v1= "+v1+" v2= "+v2);
}}