public class Solution {
static	int[] sumzero(int[] nums){
	int positivecount=0,negativecount=0;
	Arrays.sort(nums);
	int result[]=new int[2];
	for(int i=0;i<nums.length;i++)
	{
		if(nums[i]>0)
		{
			result[0]=nums[i];
			positivecount++;
			break;
		}
	}
	for(int i=0;i<nums.length;i++)
	{
		if(nums[i]<0)
		{
			result[1]=nums[i];
			negativecount++;
			break;
		}
	}
	if(negativecount==0)
	{
	   result[0]=nums[nums.length-1];
	   result[1]=nums[nums.length-2];
	}
	else if(positivecount==0)
	 	return result;
	 return result;
	}
	
	
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
    	int n;
    	System.out.println("Enter size of array");
    	n=in.nextInt();
    	int nums[]=new int[n];
    	System.out.println("Enter the positive and negative number");
    	for(int i=0;i<n;i++){
    		nums[i]=in.nextInt();
    	}
    	int ans[]=sumzero(nums);
    	System.out.println("The sum is closer to zero  2");
    	for(int i=0;i<ans.length;i++){
    		System.out.println(ans[i]);
    	}
    }
}
