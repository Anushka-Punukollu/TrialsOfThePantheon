// IMPORTS
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import javax.swing.ImageIcon;

public class Enemy {
	
	/* The Enemy class represents an enemy character, the snakes in a game. 
	 * It manages the enemy's position, visibility, health, and movement using 
	 * ImageIcon and Rectangle objects. It provides methods for updating the enemy's 
	 * position, decreasing its health, and retrieving information about the enemy's 
	 * attributes. The class provides methods to update the enemy's x and y positions 
	 * based on input directions ("left" or "right" for x-axis, "up" or "down" for y-axis).
	 * The decreaseHealth method reduces the enemy's health by a fixed amount. The resetHealth 
	 * method resets the enemy's health to its initial value. The mask method creates a 
	 * rectangular shape representing the enemy's mask relative to a specified camera position.
	 */
	
	private ImageIcon snakes; 
	private int xPos, yPos; 	
    private Rectangle2D mask; 
	private int health;
	private Random rand;

	public Enemy() {
		// Create an ImageIcon for the enemy's image 
		snakes = new ImageIcon("Enemy/Snake.gif");

		// Initialize the Random object
		rand = new Random();
				
		// Set x and y positions both to 350 to start with
		xPos = 350; 
		yPos = 350; 
		
		// Set the initial health of the enemy to 30
		health = 30; 
	} 

	// Create a Rectangle2D representing the enemy's mask relative to the camera's position
	public Rectangle2D mask(int CameraX, int CameraY) {
		
		mask = new Rectangle2D.Double(getX() - CameraX, getY() - CameraY, snakes.getIconWidth(), snakes.getIconHeight());
		
		// Return the enemy's mask
		return mask;
	}
	
	public int getHealth() {
		// Return the enemy's health
		return health;
	}

	public void resetHealth() {
		// Reset the enemy's health to the initial value
		health = 30;
	}

	public void decreaseHealth() {
		// Decrease the enemy's health by 5
		health -= 5;
	}
	public int enemyHealth() { 
		// Return the enemy's health
		return health; 
	}

	public void setLocation(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public int getX() {
		// Return the enemy's x position
		return xPos;
	}

	public int getY() {
		// Return the enemy's y position
		return yPos;
	}

	public ImageIcon getImgs() {
		// Return the enemy's image
		return snakes;
	}

	public void setX(String i) {
		// Generate a random speed for the enemy
		int speed = rand.nextInt(5) + 3;

		// Move the enemy to the left by the random speed
		if (i.equals("left")) {
			xPos -= speed;
		}
		
		// Move the enemy to the right by the random speed
		else if (i.equals("right")) {
			xPos += speed; 
		}
	}
	
	public void setY(String i) {
		// Generate a random speed for the enemy
		int speed = rand.nextInt(5) + 3;
		
		// Move the enemy down by the random speed
		if (i.equals("down")) {
			yPos += speed;
		}
		
		// Move the enemy up by the random speed
		else if (i.equals("up")) {
			yPos -= speed; 
		}	
	} 

	public Rectangle getBounds() {
		// Return a Rectangle representing the enemy's bounds
	    return new Rectangle(getX(), getY(), snakes.getIconWidth(), snakes.getIconHeight());
	}

}