package day3;

import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Hello!");
	String answer = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "Hi " + answer);
	String answer1 = JOptionPane.showInputDialog("What is your adress?");
	JOptionPane.showMessageDialog(null, "Thanks for letting me know....");
	String answer2 = JOptionPane.showInputDialog("What is your phone number?");
	JOptionPane.showMessageDialog(null, "Ok " + answer + ", your adress is " + answer1 + ", and your phone number is " + answer2 + ". You shouldn't have given me all of your information. Hahahahahhahahahahahaha!");
}
}
