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
		
	}
	
	public void testMethod2(){
		
	}
	
	public void testMethod3(){
		
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
