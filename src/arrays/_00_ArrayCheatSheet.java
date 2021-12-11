package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		Random ran = new Random();
		//1. make an array of 5 Strings
		String[] names = {"tango", "pluto", "tofu", "eight", "haruki"};
		//2. print the third element in the array
		System.out.println(names[3]);
		//3. set the third element to a different value
		names[3] = "juice panda";
		//4. print the third element again
		System.out.println(names[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		//6. make an array of 50 integers
		int[] numbers = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0; i<numbers.length; i++) {
		
			numbers[i] = ran.nextInt(50);
			
			if(numbers[i]==0) {
				
			
			System.out.println(numbers[i]);
		}
		}
		 
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		//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
		//10. print the largest number in the array.
	}
}
