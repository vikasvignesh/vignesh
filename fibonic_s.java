package cc;
import java.awt.im.InputContext;
import java.util.Scanner;
import java.*;
public class Ew {
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
int fib[]=new int[50];
fib[0]=0;
fib[1]=1;
int n,i;
n=s.nextInt();
for(i=0;i<n;i++){
	fib[i+2]=fib[i]+fib[i+1];
	System.out.println(fib[i]);
}
}}