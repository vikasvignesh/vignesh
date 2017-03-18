package cc;
import java.util.Scanner;
import java.*;
public class Ew {
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n,i;
		n=s.nextInt();
		for(i=1;i<=n/2;i++){
			if(n%i==0){
				System.out.println(i);
			}
		}
		
	}}