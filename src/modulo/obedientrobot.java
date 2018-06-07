package modulo;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
	Robot salmon=new Robot();
public static void main(String[] args) {
	obedientrobot salmon1=new obedientrobot();
salmon1.drawsquare();

}
void drawsquare() {
	for (int i = 0;i < 4;i++) {
		salmon.penDown();
		salmon.move(100);
		salmon.turn(90);
		
	}
}
}
