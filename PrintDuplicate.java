package week1.day2;

public class PrintDuplicate
{public static void main(String[] args) {
	int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	int len=arr.length;
	int count=0; 
	for (int i = 0; i < len-2; i++)
	{
		count=1;
		for (int j = i+1; j <len-1; j++) 
		{
			if(arr[i]==arr[j])
			{
				count++;
			 }
			}
		
	if(count>1)
	{
		System.out.println("Duplicate elements in array:"+arr[i]+ "occurence:" +count);
	}
	}
	}
	// get the length of the array
	// declare an int variable named count
	
	// iterate from 0 to the array length-1 (outer loop starts here)
	
		// assign 0 to count 
		
		// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
		
				// compare both the loop variables & check they're equal
			
						// increase the count if both the arrays are equal
				
		// Out of the inner loop, check and print the first array variable


}
