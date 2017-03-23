package cc;
import java.util.Scanner;
import java.*;
public class Ew {
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
int i,j,k;
i=s.nextInt();
j=s.nextInt();
k=s.nextInt();
if(i>j&&i>k){
	System.out.println(i+"is greater ");
}else if (j>k) {
	System.out.println(j+"is greater");
}
else if(i==j){
	if(i==k){
		System.out.println("three are equal");;
	}
}else {
	System.out.println(k+"is greater");
}
}}