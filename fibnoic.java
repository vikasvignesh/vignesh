package cc;
import java.util.Scanner;
import java.*;
public class Ew {
	
	public static void main(String args[]){
		int f[]=new int[100];
		int n,i,j=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		f[0]=0;
		f[1]=1;
		for(i=0;i<n;i++){
			f[j+1]=f[i]+f[j];
			j++;
		}
		for(i=0;i<n;i++){
			System.out.println(f[i]);
		}
	}}