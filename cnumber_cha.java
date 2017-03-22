package cc;
import java.util.Scanner;
import java.*;
public class Ew {
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
String a;
int i,c=0,o=0;
a=s.nextLine();
for(i=0;i<a.length();i++){
if(Character.isAlphabetic(a.charAt(i))){
	c++;
}else{
	o++;
}
}
System.out.println("Number of characters="+c+"\nOther characters="+o);
}}