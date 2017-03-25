package cc;
import java.awt.im.InputContext;
import java.util.Scanner;
import java.*;
public class Ew {
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
StringBuffer a=new StringBuffer();
a.append(s.nextLine());
a.reverse();
System.out.println("Reverse:"+a);
int i;
boolean flag=false;
for(i=0;i<a.length();i++){
	if((Character.toLowerCase(a.charAt(i))=='a')||(Character.toLowerCase(a.charAt(i))=='e')||(Character.toLowerCase(a.charAt(i))=='i')||(Character.toLowerCase(a.charAt(i))=='o')||(Character.toLowerCase(a.charAt(i))=='u'))
	{
		flag=true;
	}else{
		System.out.print(a.charAt(i));
	}
}
if(flag){
	System.out.println("\nvowel removed");
}else
{
	System.out.println("\n no vowel removed");
}
}}
