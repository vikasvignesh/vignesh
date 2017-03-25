package cc;
import java.awt.im.InputContext;
import java.util.Scanner;
import java.*;
public class Ew {
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
int get_num[]=new int[50];
int great=-11,i;

for(i=0;i<10;i++){
	get_num[i]=s.nextInt();
	if(get_num[i]>great){
		great=get_num[i];
	}
}
System.out.println("maximum ="+great);
}}