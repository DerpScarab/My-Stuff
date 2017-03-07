import java.awt.event.WindowEvent;
import java.util.Scanner;
import javax.swing.JFrame;

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
		
		else if (user>5 && user<=0){
			System.out.println("Error, please try again");
			System.out.println("Which method would you like to run?");
			user = myScanner.nextInt();
		}
		
	}
	
	public void testMethod1(){//DO NOT TEST, WILL OPEN WINDOWS FOREVER
		while(true){
			int count=0;
			JFrame frame=new JFrame("you just got prank'd");
			frame.setSize(100,0);
			count++;
			frame.setVisible(true);
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		}
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
