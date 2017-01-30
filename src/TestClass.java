import java.util.Scanner;

public class TestClass {
	Scanner myScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestClass();
	}

	public TestClass(){
		whichMethod();
	}
	
	public void whichMethod(){
		System.out.println("Which method would you like to run?");
		int user = myScanner.nextInt();
		
		if (user == 1){
			testMethod1();
		}
		
		if (user == 2){
			testMethod2();
		}
		
		if (user == 3){
			testMethod3();
		}
		
	}
	
	public void testMethod1(){
		int[] start = new int[20];
		int middle = 20;
			
		for (int counter = 0; counter<20; counter++){
			start[counter] = 1 + (int)(Math.random() * 20);
			System.out.printf(start[counter] + " ");
		}
		
		System.out.println("");
		System.out.println("");
			
		for (int count1 = 0; count1<middle; count1++) {
			for (int count2=count1+1; count2<middle; count2++){
				if(start[count1] == start[count2]){
					start[count2] = start[middle-1];
					middle--;
					count2--;	
				}
				
			}
			
		}
		
	}
	
	public void testMethod2(){
		int height = 4;
		int width = 3;
		
		if (height==1){
			for(int counter = 0; counter<width-1; counter++){
				System.out.printf("*");
			}
			
			System.out.println("*");
			
		}
		
		else if (height==2){
			for(int count1 = 0; count1<2; count1++){
				for(int count2 = 0; count2<width-1; count2++){
					System.out.printf("*");
				}
				
				System.out.println("*");
			}
			
		}
		
		else if (height>=2) {
			for(int counter = 0; counter<width-1; counter++){
				System.out.printf("*");
			}
			
			System.out.println("*");
			
			for(int count1 = 0; count1<height-2; count1++){
				System.out.printf("*");
				for(int count2 = 0; count2<width-2; count2++){
					System.out.printf(" ");
				}
				
				System.out.println("*");
				
			}
			
			for(int counter = 0; counter<width-1; counter++){
				System.out.printf("*");
			}
			
			System.out.println("*");
			
		}
		
	}
	
	public void testMethod3(){
		int match = 0;
		String cont = "Y";
		int guess = 1;
		int rndNum = 1 + (int)(Math.random() * 1000);//Fetches a random number
		System.out.println("Guess a number between 1 and 1000.");
		int usrNum = 0;
		
		while (cont.equals("Y")){
			
			while (usrNum!=rndNum){//While the numbers aren't equal
				usrNum = myScanner.nextInt();
				
				//code goes here
				
				if (usrNum!=rndNum){//If the number entered is not the random number, it prints how many digits are correct
					System.out.println(match + " digits match.");
					guess++;
				}
			
			}
		
			if (usrNum==rndNum){// If the numbers are equal, you win
				System.out.println("You got it! It took you "+ guess +" Guesses.");//It took you x guesses
				System.out.println("Would you like to play again? (Y/n)");
				cont = myScanner.next();
				
				if (cont.equals("Y")){
					guess = 0;
					rndNum = 1 + (int)(Math.random() * 1000);//Restarts from the beginning
					System.out.println("Guess a number between 1 and 1000.");
				}
				
			}
			
		}
		
	}

}

//            00000000000000
//            00000000000000000
//     0      0000000000000000000
//    00      000000000000000000000
//   000      0000000000000000000000
//  0000      00000000000000000000000
// 00000      000000000000000000000000
// 00000      000000000000000000000000
// 00000      000000000000000000000000
// 00000      000000000000000000000000
//
//
//   000      0000000000000000000000
//    00      000000000000000000000
//     0      0000000000000000000
//            00000000000000000
//            00000000000000
