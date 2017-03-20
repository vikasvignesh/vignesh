package cc;
import java.util.Scanner;
import java.*;
public class Ew {
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
int i,sum=0,oddsum=0;
for(i=0;i<45;i++){
	if(i<=15)
	sum+=i;
	if(i>=15){
		if(i%2!=0){
			oddsum+=i;
		}
	}
}
System.out.println("sum="+sum+"\noddsum="+oddsum);
}}