package day3;
import java.util.Random;

import javax.swing.JOptionPane;
public class Magic8Ball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int x = new Random().nextInt(4);
		// 3. Print out this variable
System.out.println(x);
		// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Enter a question below.");
		// 5. If the random number is 0
if (x==0) {
	JOptionPane.showMessageDialog(null, "Yes");
}

		// -- tell the user "Yes"

		// 6. If the random number is 1
if (x==1) {
	JOptionPane.showMessageDialog(null, "No");
}

		// -- tell the user "No"

		// 7. If the random number is 2
if (x==2) {
	JOptionPane.showMessageDialog(null, "Maybe you should ask Google.");
}

		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
if (x==3) {
	JOptionPane.showMessageDialog(null, "Maybe...");
}
}
		// -- write your own answer

	}