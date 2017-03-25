package cc;
import java.awt.im.InputContext;
import java.util.Scanner;
import java.*;
public class Ew {
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
StringBuffer a=new StringBuffer();
a.append(s.nextLine());
int i,c=0;

for(i=0;i<a.length();i++){
	if(Character.isDigit(a.charAt(i))){
		c++;
	}else if (a.charAt(i)==Math.round(a.charAt(i))) {
		c++;
	}
}
if(c==a.length()){
	System.out.println("'"+a+"'"+"is true");
}else
{
	System.out.println("'"+a+"'"+"is false");
}
}}