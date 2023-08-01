// IMPORTS
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;

public class Player {
	
	/* The Player class represents a player in a game. It manages the player's position, 
	 * direction, and appearance using ImageIcon objects. It provides methods for moving 
	 * the player in different directions (left, right, up, and down) and retrieving 
	 * information about the player, such as its position, dimensions, current image, 
	 * and direction. The move methods (moveLeft, moveRight, moveUp, moveDown) update the 
	 * player's position and direction based on the specified number of pixels.
	 */
	
	private int xPos, yPos;
	private ImageIcon playerIcon;
	private int width, height;
	private Rectangle2D playerMask;

	public Player() {
		// Set the initial x position to 100
		xPos = 100;
		
		// Set the initial y position to 100 
		yPos = 100;

		// Create an ImageIcon for the player's initial image
		playerIcon = new ImageIcon("Player/Up1.png");
		
		// Get the width of the playerIcon
		width = playerIcon.getIconWidth();
		
		// Get the height of the playerIcon
		height = playerIcon.getIconHeight(); 

	}

	public void moveLeft(int pixels) {
		// Set the playerIcon to the left-facing image
		playerIcon = new ImageIcon("Player/Left1.png");
		
		// Move the player's x position to the left by the specified number of pixels
		xPos -= pixels;	
	}

	public void moveRight(int pixels) {
		// Set the playerIcon to the right-facing image
	 	playerIcon = new ImageIcon("Player/Right1.png");
		
		// Move the player's x position to the right by the specified number of pixels
		xPos += pixels; 

	}
	
	public void moveUp(int pixels) {
		// Set the playerIcon to the upward-facing image
		playerIcon = new ImageIcon("Player/Up1.png");
		
		// Move the player's y position up by the specified number of pixels
		yPos -= pixels;	
	}
	
	public void moveDown(int pixels) {
		// Set the playerIcon to the downward-facing image
		playerIcon = new ImageIcon("Player/Down1.png");
		
		// Move the player's y position down by the specified number of pixels
		yPos += pixels; 
	}
	
	public int getWidth() {
		// Return the width of the playerIcon
		return width; 
	} 

	public int getHeight() {
		// Return the height of the playerIcon
		return height; 
	}
	
	public void setY(int y) {
		// Set the y position of the player to the specified value
		yPos = y;
	}
	
	public void setX(int x) {
		// Set the x position of the player to the specified value
		xPos = x;
	}
	
	public ImageIcon getImage() {
		// Return the current playerIcon
		return playerIcon;
	}
	
	public Rectangle2D getMask()
	{
		//Player Mask + Return it
		playerMask = new Rectangle2D.Double(xPos, yPos, playerIcon.getIconWidth(), playerIcon.getIconHeight());
		return playerMask;
	}
	
	public int getX() {	
		// Return the current x position of the player
		return xPos;
	}

	public int getY() {
		// Return the current y position of the player
		return yPos;
	}

	public Rectangle getBounds() {
		// Return a Rectangle representing the player's bounds
	    return new Rectangle(getX(), getY(), getWidth(), getHeight());
	}

}