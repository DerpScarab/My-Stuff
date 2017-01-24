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
		
	}
	
	public void testMethod3(){
		
	}

}

//           000000000000000
//           000000000000000000
//     0     00000000000000000000
//    00     0000000000000000000000
//   000     00000000000000000000000
//  0000     000000000000000000000000
// 00000     0000000000000000000000000
// 00000     0000000000000000000000000
// 00000     0000000000000000000000000
// 00000     0000000000000000000000000
//
//
//   000     00000000000000000000000
//    00     0000000000000000000000
//     0     00000000000000000000
//           000000000000000000
//           000000000000000
