import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

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