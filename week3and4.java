package week3and4;

public class week3and4 {

	public static void main(String[] args) {
		// Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 73};
		
		
		//Programmatically subtract the value of the first element in the array from the value in the last
		//element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		int result = ages[ages.length - 1] - ages[0];
		System.out.println(result);
		
		//Use a loop to iterate through the array and calculate the average age. Print the result to the console
		double total = 0.0;
		
		for (int i = 0; i < ages.length; i++) {
			total += ages[i];
		}
		
		double average = total / ages.length;
		System.out.println("Average age: " + average);
		
		//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console
		double totalLetters = 0.0;
		for (int i = 0; i < names.length; i++)
		{
			totalLetters += names[i].length();
		}
		double averageLetters = totalLetters / names.length;
		System.out.println("Average number of letters per name: " + averageLetters);
		
		/*
		   3:
		   How do you access the last element of any array?
		   array[array.length - 1]
		 */
		
		
		/*
		   4:
		   How do you access the first element of any array?
		   array[0];
		 */
		
		//Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the 
		//length of each name to the nameLengths array.
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console
		
		int sumOfNameLengths = 0;
		for (int individualLength : nameLengths) {
			sumOfNameLengths += individualLength;
		}
		System.out.println("Sum of all elements: " + sumOfNameLengths);
		
		
	
		}
	
		//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times
		public static String repeatWord (String word, int n){
		String result = "";
		for (int i = 0; i < n; i++){
			result += word;
		}
		return result;
		}
		
		//Write a method that takes two Strings, firstName and lastName, and returns a full name
		public static String fullName (String firstName, String lastName){
			return firstName + " " + lastName;
		}
	
		//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100
		public static boolean greaterThan100 (int[] numbers){
			int sum = 0;
			for(int number : numbers){
			sum += number;
		} if (sum > 100)
			return true;
		else
			return false;
		}
	
		//Write a method that takes an array of double and returns the average of all the elements in the array
		public static double findAverage (double[] numbers){
		double sum = 0.0;
		for (double number : numbers){
			sum += number;
		} return sum / numbers.length;
		}
	
		//Write a method that takes two arrays of double and returns true if the average of the elements in the 
		//first array is greater than the average of the elements in the second array.
		public static boolean isFirstGreater (double[] first, double[] second)
		{
		double averageFirst = findAverage(first);
		double averageSecond = findAverage(second);
		if (averageFirst > averageSecond){
			return true;
		}
		else {
			return false;
		}
			
		}
		
		
		
	
		//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
		//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){
		if (isHotOutside == true && moneyInPocket > 10.50)
			return true;
		else
			return false;
		}
	
		/*
		   Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		   its a simple tip calculator
		   
		 */
		public static double total(double bill, int tip){
		double tipAmount = bill * (tip / 100.0);
		return bill + tipAmount;
		}
}




