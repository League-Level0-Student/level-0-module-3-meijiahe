
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "Feburary 19th";
		String dadsBirthday = "Januarary 19th";
		String myBirthday = "June 2th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String answer=JOptionPane.showInputDialog(null,"What birthday do you want to ask for?");
	if(answer.equals("mom")) {
		JOptionPane.showMessageDialog(null,"Feburary 19th");
	}
	if(answer.equals("dad")) {
		JOptionPane.showMessageDialog(null,"Janurary 19th");
	}
	if(answer.equals("Grace")) {
		JOptionPane.showMessageDialog(null,"June 2th");
	}
		// 3. Print out what the user typed
		System.out.println(answer);
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
