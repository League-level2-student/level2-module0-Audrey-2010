package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	
Random ran = new Random();
	//2. create an array of 5 robots.
Robot[] bots= new Robot[5];
	//3. use a for loop to initialize the robots.
for(int i = 0; i<bots.length; i++) {
bots[i] = new Robot();
bots[i].setX(i*150);
bots[i].setY(500);
bots[i].setSpeed(2);
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
//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

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
for(int i = 0; i<bots.length; i++) {
	int randomnumber = ran.nextInt(150);
	
	bots[i].move(randomnumber);
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
} 








