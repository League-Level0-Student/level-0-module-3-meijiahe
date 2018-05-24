package extra;

import javax.swing.JOptionPane;

public class Areyouhappy {
public static void main(String[] args) {
String answer=JOptionPane.showInputDialog(null,"Are you happy?");
if(answer.equals("yes")) {
JOptionPane.showMessageDialog(null,"keep doing whatever you're doing.");
}
else {
	JOptionPane.showInputDialog(null,"Do you want to be happy?");
	if(answer.equals("yes")) {
		JOptionPane.showMessageDialog(null,"change something");
	}
	else {
		JOptionPane.showMessageDialog(null,"Keep doing whatever you're doing");
	}
}
}
}


