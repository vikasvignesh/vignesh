package d;
import java.util.*;
public class Subset {
	  static int substr(int t1[],int t2[]){
		  int i,j,c=0;
		 for(i=0;i<t2.length;i++){
			 for(j=0;j<t1.length;j++){
				 if(t1[j]==t2[i]){
					 c++;
					 break;
				 }
			 }
		 }
		 if(t2.length==c){
			 return 1;
		 }
		 else{
   	 return 0;
		 }
    }
	public static void main(String args[])
	{
     int n1,n2,i;
     Scanner o=new Scanner(System.in);
     System.out.println("Enter n.o array");
     n1=o.nextInt();
     int a1[]=new int[n1];
     for(i=0;i<n1;i++){
    	 a1[i]=o.nextInt();
     }
     System.out.println("Enter n.o array");
     n2=o.nextInt();
     int a2[]=new int[n2];
     for(i=0;i<n2;i++){
    	 a2[i]=o.nextInt();
     }
     
     if((substr(a1,a2))==1){
    	 System.out.println("a1 is subset of a2");
     }else{
    	 System.out.println("a1 is not subset of a2");
     }
	}
}			