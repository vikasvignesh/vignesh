package d;
import java.util.*;
public class as {
	static void findsum(int tem[]){
		int i,j,n,m,max=-1,min=-999,c=0;
		for(i=0;i<tem.length;i++){
			if(tem[i]<0){
				m=tem[i];
				n=(tem[i]*-1)+1;
				for(i=0;i<tem.length;i++)
				if(n==tem[i]){
					System.out.println(m+" "+n);
					break;
				}else{
					c++;
				}
					if(c==tem.length){
					for(i=0;i<tem.length;i++){
						if(tem[i]<0){
							if(min<tem[i]){
								min=tem[i];
							}
						}else{
							if(max<tem[i])
								max=tem[i];
						}
					}
					System.out.println(max+" "+min);
				}
				
			}
		}
		
	}
public static void main(String args[]){
	int n,i,c=0,c1=0;
	Scanner o=new Scanner(System.in);
	n=o.nextInt();
	int arr[]=new int[n];
	for(i=0;i<n;i++){
		arr[i]=o.nextInt();
	}
	for(i=0;i<n;i++){
		if(arr[i]>0)
			c++;
		else if(arr[i]<0)
			c1++;
	}
	if(c==arr.length)
		System.out.println("You Entered all positive");
	else if(c1==arr.length)
		System.out.println("You Entered all negative");
	else
		findsum(arr);
	}
}			