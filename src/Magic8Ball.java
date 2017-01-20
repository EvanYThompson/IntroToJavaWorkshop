
// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

import com.sun.javafx.binding.StringConstant;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int stephano=new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(stephano);
// 4. Get the user to enter a question for the 8 ball
String question=JOptionPane.showInputDialog("Enter a question for the eight ball");
	// 5. If the random number is 0
if (stephano== 0) {
	JOptionPane.showMessageDialog(null, "yes");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
if (stephano== 1) {
	JOptionPane.showMessageDialog(null, "no");
}
	// -- tell the user "No"

	// 7. If the random number is 2
if (stephano== 2) {
	JOptionPane.showMessageDialog(null, "Maybe you should ask google");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
if (stephano== 3) {
	JOptionPane.showMessageDialog(null, "Good luck clown");
}
	// -- write your own answer

}
}


