package exercise2;

import java.util.Random;

public class Driver
{
	

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 10;

	public static void main( String[] args )
	{
        if (args.length < 1) {
            System.out.println("Please input the <target>");
            return;
        }
        
        // Parse the target value from command-line arguments
        	int target = Integer.parseInt(args[0]);

        	Integer[] nums = new Integer[SIZE];
        	Random rand = new Random();
        	int randnum = rand.nextInt( UPPER_BOUND );
        	nums[0] = randnum;

        	for( int i = 1; i < SIZE; i++ )
        	{
        		randnum = rand.nextInt( UPPER_BOUND );
        		nums[i] = nums[i - 1] + randnum;
        		System.out.println( nums[i] );
        	}
		
        	int result = BinarySearch.binarySearch(nums, target);
        	if (result != -1) {
        		System.out.println("Element found at index " + result);
        	} else {
        		System.out.println("Element not found");
        	}

	}
	
	public static class BinarySearch {
		public static int binarySearch(Integer[] nums, int target) {
			int left = 0;
			int right = nums.length - 1;
			
			while (left <= right) {
				int mid = left + (right - left)/2;
				
				if (nums[mid] == target) {
					return mid;
				}
				
				if (nums[mid] > target) {
					right = mid - 1;
				}
				
				else {
					left = mid + 1;
				}
			}
			return -1; // If the element is not found;
		}
		
	}

}
