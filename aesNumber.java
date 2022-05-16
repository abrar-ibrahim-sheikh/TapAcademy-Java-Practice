package demoProject;
import java.util.Scanner;

public class aesNumber {
	static boolean isAesNumber(int n) { //will return true/false depending on the input
		int count = 0;                  //to keep track of no of divisible elements 
		for(int i=1;i<=n;i++) {         //looping through the factors of input number 
			if(n%i == 0) {              //checking if remainder is present
				count++;			    //if present increment the count
			}
		}
			if(count == 4) {            //eligible aes number has a count of 4 factors
				return true;
			}
			else {
				return false;
			}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int r = scan.nextInt();
	    int i;
	    int aes = 0;
		
		for(i=l;i<=r;i++) {
			if(isAesNumber(i)) {
				System.out.println("AES values: "+ i);
				aes++;
			}
		}
		System.out.print("Total number of aes numbers are: " +aes);
		
	}
}	
	

