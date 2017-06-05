import java.util.*;
public class Star {
public static void main(String[] args) {
	String n;
	int i;
	Scanner o=new Scanner(System.in);
	n=o.nextLine();
	for(i=0;i<n.length()-1;i++){
		System.out.print(n.charAt(i));
		if(n.charAt(i)==n.charAt(i+1)){
			System.out.print("*");
		}
	}
	System.out.println(n.charAt(i));
		
}
}
