package cc;
import java.util.Scanner;
import java.*;
public class Ew {
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int g1,g2,n=1,r=0;
		g1=s.nextInt();
		g2=s.nextInt();
		if(g1<g2){
			while(n!=0){
			r=n;	
			n=g2%g1;
			g2=g1;
			g1=n;
		}}
		else{
			while(n!=0){
				r=n;	
				n=g1%g2;
				g1=g2;
				g2=n;
		}
		
		
	}
		System.out.println(r);}}