package d;
import java.util.*;
public class as {
	static void findsum(int tem[]){
		int i,j,ans1,ans2,ans11,ans12,t1,t2;
		for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if((tem[i]+tem[j])>0)
            {
                if(tem[i]+tem[j]<t1)
                {
                    t1=tem[i]+tem[j];
                    ans1=tem[i];
                    ans2=tem[j];
                }
            }
            else if(tem[i]+tem[j]<0)
            {
                if(tem[i]+tem[j]>t2)
                {
                    t2=arr[i]+arr[j];
                    ans11=arr[i];
                    ans12=arr[j];
                }
            }
        }
    }
    //to find element sum closest to zero but not zero
    if(t1+t2<0)
        System.out.println(ans1+" "+ans2);
    else
        System.out.println(ans11+" "+ans12);
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
