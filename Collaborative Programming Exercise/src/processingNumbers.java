import java.util.*;
public class processingNumbers {
	public static void main(String[] args){
		System.out.println("enter four numbers");
		Scanner userInput = new Scanner(System.in);
		int min=userInput.nextInt();
		int inputNumber=min;
		int max=min;
		int total=0;
		for (int i=0;i<4;i++){
			inputNumber=userInput.nextInt();
			if(inputNumber%2==0){
				total+=inputNumber;
			}
			total+=inputNumber;
		}
		System.out.println(total);
	}
}
