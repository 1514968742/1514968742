//pair programming,Kinson Poon apcs 2
//10-1-2016
//this program take in x numbers as the user entered and find the maximum and minimum of those numbers
//if the number they entered is even, find the sum of those numbers and find the maximum of all the evens entered
import java.util.*;
public class processingNumbers {

	private static Scanner userInput;

	public static void main(String[] args){
		userInput = new Scanner (System.in);
		System.out.println("How many numbers you want to enter?");
		int enterednums=userInput.nextInt();
		System.out.println("type " + enterednums + " ints");
		int max=userInput.nextInt();
		int min=max;
		int evenmax=0;
		int totalsum=0;
		if(max%2==0){
			totalsum+=max;
			evenmax=max;
		}
		for(int i=1;i<enterednums;i++){
			int inputNumber=userInput.nextInt();
			if(inputNumber%2==0){
				totalsum+=inputNumber; //sum of even nums
				if (inputNumber>evenmax){
					evenmax=inputNumber; //find the max of even nums
				}
			}
			if(inputNumber<min){ //min of all nums
				min=inputNumber;
			}
			if(inputNumber>max){ //max of all nums
				max=inputNumber;
			}
		}
		System.out.println("the min "+min);
		System.out.println("the max "+max);
		System.out.println("the evenmax "+evenmax);
		System.out.println("the sum of evens: "+totalsum);
	}
}
