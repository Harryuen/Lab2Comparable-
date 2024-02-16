package exercise3;

public class BubbleSort{
	public void sort(int arry[]) {
		for (int i = 0; i < arry.length; i++)
			for (int j =1 ; j < arry.length; j++)
				if (arry[j] < arry[j-1]) {
					int temp = arry[j];
					arry[j] = arry[j-1];
					arry[j-1] = temp;
				}
	}
}