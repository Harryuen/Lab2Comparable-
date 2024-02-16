package exercise3;

import java.util.Arrays;
import java.util.Random;

public class Driver
{

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 1000;

	public static void main( String [] args )
	{
		int[] nums = new int[SIZE];
		Random rand = new Random();

		for( int i = 0; i < SIZE; i++ )
		{
			nums[i] = rand.nextInt( UPPER_BOUND );
			System.out.println( nums[i] );
		}
		
        if (args.length < 1) {
            System.out.println("Please input the <target>");
            return;
        }
        
        else {
            // Parse the target value from command-line arguments
            String method = args[0];

            switch (method) {
                case "b":
                    BubbleSort bSort = new BubbleSort();
                    bSort.sort(nums);
                    System.out.println("Sorting using Bubble Sort:");	
                    break;
                case "s":
                    // Call selection sort
                	System.out.println("Sorting using Selection Sort:");
                    break;
                case "i":
                    // Call insertion sort
                	System.out.println("Sorting using Insertion Sort:");
                    break;
                case "q":
                    // Call insertion sort
                	System.out.println("Sorting using QuickSort:");
                    break;
                default:
                    System.out.println("Invalid method");
                    return;
            }
            System.out.println(Arrays.toString(nums));
        }
        
        
        	
	}
	

}
