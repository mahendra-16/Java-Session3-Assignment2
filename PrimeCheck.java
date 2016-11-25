package session3;

import java.util.Scanner;

public class PrimeCheck {

	int a;
	int b;
	boolean isPrime = true;

	void checkPrime(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
	/*	if((a == 0)||(a == 1)){
			isPrime = false;
		}  */
		
		for(b = 2; b <= a/2; b++){
			if(a % b == 0){
				isPrime = false;
				break;
			}
		}
		
		if(isPrime == true){
			System.out.println(a + " : is a Prime");
		}else{
			System.out.println(a + " : Not a Prime number");
		}
	}
	
}
