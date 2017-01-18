package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		int w= 500;
		int f= 90;
		int k= 400;
		
Robot stephano=new Robot () ;
	stephano.penDown();
	stephano.sparkle();
	stephano.setSpeed(10);
for(int i=0;i<4;i++){
    
	stephano.move(w);
	stephano.turn(f);
}
	stephano.hide();
	stephano.penUp();
	stephano.move(k);
	stephano.turn(f);
	
	

		
	}
}
