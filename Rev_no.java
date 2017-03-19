import java.util.Scanner;
import java.*;
public class Ew {
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int r,r1,ans=0;
		r=s.nextInt();
		while(r!=0){
			r1=r%10;
			ans=ans*10+r1;
			r/=10;
		}
		System.out.println(ans);
	}}