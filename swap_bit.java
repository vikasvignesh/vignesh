package cc;
import java.util.Scanner;
import java.*;
public class Ew {
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
int i,j;
i=s.nextInt();
j=s.nextInt();
i=i^j;
j=i^j;
i=i^j;
System.out.println("i= "+i+"j="+j);
}}