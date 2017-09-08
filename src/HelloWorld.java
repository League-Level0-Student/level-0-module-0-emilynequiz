import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.Tortoise;

public class HelloWorld {
	public static void main(String[] args) {
		Robot r2d2 = new Robot();
		r2d2.setSpeed(10);
		r2d2.move(400);
		JOptionPane.showMessageDialog(null, "WELCOME TO LEVEL 0!!");
	}
}
