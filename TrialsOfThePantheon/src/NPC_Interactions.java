import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;

public class NPC_Interactions {
	
	/* This class manages interactions with non-playable characters (NPCs) in a game. It provides methods to 
	 * retrieve information about the NPCs, such as their positions, images, and collision masks. This class 
	 * helps simplify the management of NPCs in the game by making it easier to add, remove, or modify NPCs 
	 * as needed. Moreover, it provides methods to define and retrieve the bounds of the maze, ensuring that NPCs 
	 * and the player character stay within the designated game area.
	 */
	
	private ImageIcon NPC1, NPC2, NPC3, NPC4, Chest, OpenChest;
		
	private Rectangle2D npc1Mask, npc2Mask, npc3Mask, npc4Mask, ChestMask, mazeLeftBoundMask, mazeLeftBoundMask2,
	mazeLeftBoundMask3, mazeRightBoundMask, mazeRightBoundMask2, mazeRightBoundMask3, mazeUpBoundMask,
	mazeUpBoundMask2, mazeUpBoundMask3, mazeDownBoundMask, mazeDownBoundMask2, mazeLeftBoundMask2Pt2, mazeUpBoundMask2Pt2,
	mazeRightBoundMask2Pt2, mazeLeftBoundMask3Pt2, mazeUpBoundMask3Pt2, mazeRightBoundMaskPt2;

	// CONSTRUCTOR
	public NPC_Interactions() 
	{
		// Load the images for the NPCs and Chests
		NPC1 = new ImageIcon("NPC/NPC1.png");
		NPC2 = new ImageIcon("NPC/NPC2.png");
		NPC3 = new ImageIcon("NPC/NPC3.png");
		NPC4 = new ImageIcon("NPC/NPC4.png");
		Chest = new ImageIcon ("NPC/Chest1.png");
		OpenChest = new ImageIcon ("NPC/Chest2.png");
 
		// Create collision masks for each NPC and chest using their respective positions and image dimensions
		npc1Mask = new Rectangle2D.Double(45, 360, NPC1.getIconWidth(), NPC1.getIconHeight());
		npc2Mask = new Rectangle2D.Double(360, 35, NPC2.getIconWidth(), NPC2.getIconHeight());
		npc3Mask = new Rectangle2D.Double(715, 605, NPC3.getIconWidth(), NPC3.getIconHeight());
		npc4Mask = new Rectangle2D.Double(350, 200, NPC4.getIconWidth(), NPC4.getIconHeight());
		ChestMask = new Rectangle2D.Double(380, 400,OpenChest.getIconWidth(), OpenChest.getIconHeight());

	}

	public Rectangle2D getChestMask ()
	{
		ChestMask = new Rectangle2D.Double(380, 400,Chest.getIconWidth(), Chest.getIconHeight());
		return ChestMask;
	}
	
	// NPC MASKS - for intersection in main class with player
	public Rectangle2D getNPC1Mask() 
	{
		npc1Mask = new Rectangle2D.Double(73, 360, NPC1.getIconWidth(), NPC1.getIconHeight());
		return npc1Mask;
	}

	public Rectangle2D getNPC2Mask() 
	{
		npc2Mask = new Rectangle2D.Double(360, 60, NPC2.getIconWidth(), NPC2.getIconHeight());
		return npc2Mask;
	}

	public Rectangle2D getNPC3Mask() 
	{
		npc3Mask = new Rectangle2D.Double(715, 605, NPC3.getIconWidth(), NPC3.getIconHeight());
		return npc3Mask;
	}

	public Rectangle2D getNPC4Mask() 
	{
		npc4Mask = new Rectangle2D.Double(350, 200, NPC4.getIconWidth(), NPC4.getIconHeight());
		return npc4Mask;
	}

	// MAZE MASKS - for intersection in main class so that the maze follows the bounds
	public Rectangle2D leftBounds1() 
	{
		mazeLeftBoundMask = new Rectangle2D.Double(0, 0, 20, 800);
		return mazeLeftBoundMask;
	}

	public Rectangle2D leftBounds2() 
	{
		mazeLeftBoundMask2 = new Rectangle2D.Double(123, 126, 25, 640);
		return mazeLeftBoundMask2;
	}
	public Rectangle2D leftBounds2Pt2() 
	{
		mazeLeftBoundMask2Pt2 = new Rectangle2D.Double(140, 126, 37, 640);
		return mazeLeftBoundMask2Pt2;
	}
	public Rectangle2D leftBounds3() 
	{
		mazeLeftBoundMask3 = new Rectangle2D.Double(264, 280, 27, 305);
		return mazeLeftBoundMask3;
	}
	public Rectangle2D leftBounds3Pt2() 
	{
		mazeLeftBoundMask3Pt2 = new Rectangle2D.Double(297, 280, 27, 305);
		return mazeLeftBoundMask3Pt2;
	}
	public Rectangle2D rightBounds() 
	{
		mazeRightBoundMask = new Rectangle2D.Double(505, 285, 27, 120);
		return mazeRightBoundMask;
	}
	public Rectangle2D rightBoundsPt2() 
	{
		mazeRightBoundMaskPt2 = new Rectangle2D.Double(380, 285, 27, 120);
		return mazeRightBoundMaskPt2;
	}
	public Rectangle2D rightBounds2() 
	{
		mazeRightBoundMask2 = new Rectangle2D.Double(665, 140, 25, 430);
		return mazeRightBoundMask2;
	}
	public Rectangle2D rightBounds2Pt2() 
	{
		mazeRightBoundMask2Pt2 = new Rectangle2D.Double(632, 140, 30, 430);
		return mazeRightBoundMask2Pt2;
	}
	public Rectangle2D rightBounds3() 
	{
		mazeRightBoundMask3 = new Rectangle2D.Double(785, 0, 20, 800);
		return mazeRightBoundMask3;
	}
	public Rectangle2D upBounds() 
	{
		mazeUpBoundMask = new Rectangle2D.Double(20, 0, 800, 5);
		return mazeUpBoundMask;
	}
	public Rectangle2D upBounds2() 
	{
		mazeUpBoundMask2 = new Rectangle2D.Double(115, 125, 575, 25);
		return mazeUpBoundMask2;
	}
	public Rectangle2D upBounds2Pt2() 
	{
		mazeUpBoundMask2Pt2 = new Rectangle2D.Double(180, 155, 445, 25);
		return mazeUpBoundMask2Pt2;
	}
	public Rectangle2D upBounds3() 
	{
		mazeUpBoundMask3 = new Rectangle2D.Double(273, 282, 245, 27);
		return mazeUpBoundMask3;
	}
	public Rectangle2D upBounds3Pt2() 
	{
		mazeUpBoundMask3Pt2 = new Rectangle2D.Double(318, 315, 180, 27);
		return mazeUpBoundMask3Pt2;
	}
	public Rectangle2D downBounds() 
	{
		mazeDownBoundMask = new Rectangle2D.Double(265, 562, 420, 30);
		return mazeDownBoundMask;
	}
	public Rectangle2D downBoundsPt2() 
	{
		mazeDownBoundMask = new Rectangle2D.Double(265, 530, 420, 30);
		return mazeDownBoundMask;
	}
	public Rectangle2D downBounds2() 
	{
		mazeDownBoundMask2 = new Rectangle2D.Double(375, 685, 380, 64);
		return mazeDownBoundMask2;
	}
	
	// These methods get the ImageIcons for the different NPCs
	public ImageIcon getNPCIcon() 
	{
		return NPC1;
	}

	public ImageIcon getNPCIcon2() 
	{
		return NPC2;
	}

	public ImageIcon getNPCIcon3() 
	{
		return NPC3;
	}

	public ImageIcon getNPCIcon4() 
	{
		return NPC4;
	}
	
	// These methods get the ImageIcons for the different chest positions
	public ImageIcon getChestIcon() 
	{
		return Chest;
	}
	public ImageIcon getOpenChestIcon() 
	{
		return OpenChest;
	}
	
}
