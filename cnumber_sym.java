package cc;
import java.util.Scanner;
import java.*;
public class Ew {
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
String c;
int i,co=0;
c=s.nextLine();
for(i=0;i<c.length();i++){
	if(Character.isAlphabetic(c.charAt(i))){
		
	}else
	{
		if(Character.isDigit(c.charAt(i))){
			
		}else
		{
			co++;
		}
	}
	
}
if(co>0)
System.out.println("number of symbol is= "+co);
else
	System.out.println("number of symbol is= "+co);
}}