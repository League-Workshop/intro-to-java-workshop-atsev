package day3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Hello World");
	System.out.println("You are good at programming!");
	System.out.println("This is a compliment!");
	JOptionPane.showMessageDialog(null, "Hi");
	String answer = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "Hi " + answer);
}
}
