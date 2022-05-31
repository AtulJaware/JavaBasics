package functionalInterfaces;
@FunctionalInterface
interface Intf5{
	int sum(int []a);
}
public class Assignment5 {

	public static void main(String[] args) {
		
		//  Find sum of even numbers from below array
		
	    int[] arr = { 11,29,31,45,5,34};
	    
	    Intf5 intf5=(int []a) ->{
	    	int sum=0;
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		if(arr[i]%2==0)
	    		{
	    			sum=sum+arr[i];
	    		}
	    	}
	    	return sum;
	    };
	    
	    System.out.println("Sum of even numbers = "+intf5.sum(arr));

	}

}
