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
		
		else if (user == 2){
			testMethod2();
		}
		
		else if (user == 3){
			testMethod3();
		}
		
		else if (user == 4){
			testMethod4();
		}
		
		else if (user == 5){
			testMethod5();
		}
		
		else if (user>5){
			System.out.println("Error, please try again");
			System.out.println("Which method would you like to run?");
			user = myScanner.nextInt();
		}
		
	}
	
	public void testMethod1(){
		
	}
	
	public void testMethod2(){
		
	}
	
	public void testMethod3(){
		
	}
	
	public void testMethod4(){
		
	}

	public void testMethod5(){
	
	}

}

//              000000000000
//              000000000000000
//     0        00000000000000000
//    00        0000000000000000000
//   000        00000000000000000000
//  0000        000000000000000000000
// 00000        0000000000000000000000
// 00000        0000000000000000000000
// 00000        0000000000000000000000
// 00000        0000000000000000000000
//
//
//   000        00000000000000000000
//    00        0000000000000000000
//     0        00000000000000000
//              000000000000000
//              000000000000
