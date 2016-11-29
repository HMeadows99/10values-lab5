/**
 * 
 */
import java.util.Scanner;
/**
 * @author h.meadows
 * Mr.Hardman
 *Lab 5 program 2
 *11/29/2016
 */
public class tenvalues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userElement;
		int numOfNum = 0;
		int[] userValues = new int [10];
		
		Scanner userInput = new Scanner(System.in);
		
		for(int i = 0; i < userValues.length; i++){
			System.out.println("Please enter ten values");
			userValues[i] = userInput.nextInt();
			
		}
		System.out.println("What value do you want to search for");
		userElement = userInput.nextInt();
		
		for(int i = 0; i < userValues.length; i++){
			if(userValues[i] == userElement){
				numOfNum ++;
			}
		}
		
		System.out.println("Your element has been entered " + numOfNum + " Times");
		userInput.close();
	}

}
