package cc;
import java.util.Scanner;
import java.*;
public class Ew {
	
	public static void main(String args[]){
 int a,b,c=0,t;
Scanner s=new Scanner(System.in);
a=s.nextInt();
t=a;
while(a!=0){
	b=a%10;
	b=pow(b);
	c=c+b;
	a/=10;
}
if(t==c){
	System.out.println("Amstrong n.o");
}
	else {
		
	
		System.out.println("not amstrong n.o");
	}
	
}


public static int pow(int n){
	int i,pro=1;
	for(i=0;i<3;i++){
		pro*=n;
	}
	return pro;
}
}